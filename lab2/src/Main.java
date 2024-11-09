import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        PreciousStone gem1 = new PreciousStone("Діамант", 1.5f, 80, 50000);
        PreciousStone gem7 = new PreciousStone("Діамант", 3.2f, 95, 254000);
        PreciousStone gem8 = new PreciousStone("Діамант", 1.5f, 40, 34500);
        SemiPrStone gem2 = new SemiPrStone("Аметист", 2.0f, 70, 1500);
        PreciousStone gem3 = new PreciousStone("Рубін", 1.0f, 80, 3000);
        SemiPrStone gem4 = new SemiPrStone("Цирконій", 1.8f, 77, 2000);
        PreciousStone gem5 = new PreciousStone("Алмаз", 2.0f, 70, 300000);
        PreciousStone gem6 = new PreciousStone("Дорогий камінь", 2.0f, 70, 100000);

        Stone[] stones1 = new Stone[] {
                gem1, gem7, gem8
        };

        Arrays.sort(stones1, Comparator.comparing(Stone::get_price).reversed());
        List<Stone> most_exp_stones = new ArrayList<>();
        for (int i = 0; i < 0 && i < stones1.length; i++) {
            most_exp_stones.add(stones1[i]);
        }
        Stone[] most_exp_stones_arr = most_exp_stones.toArray(new Stone[0]);
        System.out.println("-----------------------------------------------------------------");
        for (Stone el : most_exp_stones_arr) {
            System.out.print(el.get_name() + " ");
        }
        System.out.println("-----------------------------------------------------------------");

        Necklace n1 = new Necklace(stones1);
        n1.get_necklace_info();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Загальна вага намиста в каратах: " + n1.get_total_weigh_carat());
        System.out.println("Загальна вартість намиста: " + n1.get_total_price());

        Stone[] sorted_stones = n1.sort_stones();
        System.out.print("Камені, відсортовані за ціною: ");
        for (Stone el : sorted_stones) {
            System.out.print(el.get_name() + " ");
        }
        System.out.print("\n-----------------------------------------------------------------");
        n1.find_by_transparency(50, 100);
    }
}
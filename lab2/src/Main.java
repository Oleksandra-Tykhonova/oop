//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        PreciousStone gem1 = new PreciousStone("Діамант", 1.5f, 95, 50000);
        SemiPrStone gem2 = new SemiPrStone("Аметист", 2.0f, 70, 1500);
        PreciousStone gem3 = new PreciousStone("Рубін", 1.0f, 80, 3000);
        SemiPrStone gem4 = new SemiPrStone("Цирконій", 1.8f, 77, 2000);


        Stone[] stones1 = new Stone[] {
                gem1, gem2, gem3, gem4
        };
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
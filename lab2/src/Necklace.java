import java.util.Arrays;
import java.util.Comparator;


public class Necklace {
    private Stone[] stones;

    public Necklace(Stone[] stones) {
        this.stones = stones;
    }

    public void get_necklace_info() {
        for (Stone el : stones) {
            System.out.println("Назва: " + el.get_name() + ", Карат: " + el.get_carat() + ", Прозорість: " + el.get_transp() + ", Ціна: " + el.get_price());
        }
    }

    public float get_total_weigh_carat() {
        float total_weight = 0;
        for (Stone el : stones) {
            total_weight += el.get_carat();
        }
        return total_weight;
    }

    public float get_total_price() {
        float total_price = 0;
        for (Stone el : stones) {
            total_price += el.get_price();
        }
        return total_price;
    }

    public Stone[] sort_stones() {
        Stone[] sorted_stones = Arrays.copyOf(stones, stones.length);
        Arrays.sort(sorted_stones, Comparator.comparing(Stone::get_price));
        return sorted_stones;
    }

    public void find_by_transparency(float min, float max) {
        System.out.println("\nКаміння з прозорістю в діапазоні " + min + "% - " + max + "%: ");
        for (Stone el : stones) {
            if (el.get_transp() >= min && el.get_transp() <= max) {
                System.out.println(el.get_name() + " " + el.get_transp() + "%");
            }
        }
    }

}

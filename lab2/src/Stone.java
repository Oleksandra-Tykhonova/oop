public class Stone {
    private float weight, transp, price;
    private String name;

    //Конструктор
    public Stone(String name, float weight, float transp, float price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.transp = transp;
    }
    public String get_name() {
        return name;
    }

    public float get_price() {
        return price;
    }

    public float get_transp() {
        return transp;
    }

    public float get_carat() {
        return weight;
    }



}

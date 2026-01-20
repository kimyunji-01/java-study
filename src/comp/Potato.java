package comp;

public class Potato {
    private String name;
    private int price;

    public Potato(String name, int price) { //풀생성자
        this.name = name;
        this.price = price;
        System.out.println(name+"이 만들어 졌어요");
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Potato{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

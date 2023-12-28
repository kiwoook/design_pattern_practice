package creational_patterns.composite;

public class Leaf extends Computer{
    private String price;

    public Leaf(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

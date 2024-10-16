package BehavioralPatterns2.Visitor.WithoutPattern;

public class Sculpture implements Exhibit {
    private String name;
    private double price;

    public Sculpture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void takePhoto() {
        System.out.println("Фотография скульптуры \"" + name + "\" сделана.");
    }
}

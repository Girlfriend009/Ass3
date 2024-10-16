package BehavioralPatterns2.Visitor.WithoutPattern;

public class Painting implements Exhibit {
    private String title;
    private double price;

    public Painting(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void takePhoto() {
        System.out.println("Фотография картины \"" + title + "\" сделана.");
    }
}


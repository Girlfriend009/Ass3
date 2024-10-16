package BehavioralPatterns2.Observer.WithoutPattern;

public class Investor {
    private String name;  // Имя инвестора

    public Investor(String name) {
        this.name = name;
    }

    // Метод, который вызывает уведомление об изменении цены акций
    public void update(double price) {
        System.out.println(name + " уведомлен о новой цене акций: " + price);
    }
}

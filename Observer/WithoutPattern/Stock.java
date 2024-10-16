package BehavioralPatterns2.Observer.WithoutPattern;

public class Stock {
    private String name;  // Название акций
    private double price; // Текущая цена акций

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Изменение цены акций
    public void setPrice(double newPrice) {
        this.price = newPrice;
        notifyInvestors();  // Уведомление инвесторов о новом значении цены
    }

    // Уведомляем инвесторов напрямую (прямое взаимодействие с конкретными объектами)
    private void notifyInvestors() {
        Investor investor1 = new Investor("Alice");
        Investor investor2 = new Investor("Bob");

        // Прямое обновление каждого инвестора
        investor1.update(this.price);
        investor2.update(this.price);
    }
}

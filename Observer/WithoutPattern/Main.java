package BehavioralPatterns2.Observer.WithoutPattern;

public class Main {
    public static void main(String[] args) {
        // Создаем объект акций
        Stock stock = new Stock("Apple", 120.00);

        // Меняем цену акций
        stock.setPrice(125.00);  // Уведомление идет напрямую через класс Stock
    }
}


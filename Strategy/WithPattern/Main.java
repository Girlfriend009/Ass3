package BehavioralPatterns2.Strategy.WithPattern;

// Главный класс для тестирования различных стратегий оплаты.
public class Main {
    public static void main(String[] args) {
        Order order = new Order(); // Создаём заказ.

        // Тестируем оплату банковской картой.
        order.setPaymentStrategy(new CardPaymentStrategy());
        System.out.println("Card payment: " + order.calculatePrice(1000));

        // Тестируем оплату электронным кошельком.
        order.setPaymentStrategy(new WalletPaymentStrategy());
        System.out.println("Wallet payment: " + order.calculatePrice(1000));

        // Тестируем оплату наложенным платежом.
        order.setPaymentStrategy(new CashOnDeliveryStrategy());
        System.out.println("Cash on delivery: " + order.calculatePrice(1000));
    }
}
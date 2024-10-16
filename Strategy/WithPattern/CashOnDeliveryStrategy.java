package BehavioralPatterns2.Strategy.WithPattern;

// Стратегия оплаты наложенным платежом: добавляет 300 тенге доставку.
public class CashOnDeliveryStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalPrice(double price) {
        return price + 300; // Добавляем 300 тенге за доставку.
    }
}

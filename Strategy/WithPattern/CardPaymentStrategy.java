package BehavioralPatterns2.Strategy.WithPattern;

// Стратегия оплаты банковской картой: добавляет комиссию 2%.
public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalPrice(double price) {
        return price * 1.02; // Добавляем 2% комиссию.
    }
}

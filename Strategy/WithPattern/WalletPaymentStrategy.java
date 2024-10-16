package BehavioralPatterns2.Strategy.WithPattern;

// Стратегия оплаты электронным кошельком: без комиссии.
public class WalletPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalPrice(double price) {
        return price; // Без комиссии.
    }
}
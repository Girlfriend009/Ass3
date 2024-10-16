package BehavioralPatterns2.Strategy.WithPattern;

// Класс Order: использует стратегию оплаты для расчета стоимости.
public class Order {
    private PaymentStrategy paymentStrategy; // Стратегия оплаты.

    // Устанавливаем стратегию оплаты.
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Рассчитываем итоговую стоимость заказа с учетом выбранной стратегии.
    public double calculatePrice(double price) {
        return paymentStrategy.calculateFinalPrice(price); // Возвращаем итоговую цену с учётом стратегии оплаты.
    }
}

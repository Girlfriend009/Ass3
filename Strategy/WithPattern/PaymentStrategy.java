package BehavioralPatterns2.Strategy.WithPattern;

// Интерфейс PaymentStrategy: описывает стратегию расчета стоимости заказа.
public interface PaymentStrategy {
    double calculateFinalPrice(double price); // Метод расчета итоговой цены.
}
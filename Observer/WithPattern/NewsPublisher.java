package BehavioralPatterns2.Observer.WithPattern;

// Интерфейс NewsPublisher: управляет подписчиками и уведомляет их.
public interface NewsPublisher {
    void addSubscriber(Observer observer); // Добавить подписчика.
    void removeSubscriber(Observer observer); // Удалить подписчика.
    void notifySubscribers(String category, String news); // Уведомить подписчиков.
}
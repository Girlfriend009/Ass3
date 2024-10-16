package BehavioralPatterns2.Observer.WithPattern;

// Интерфейс Observer: определяет, как подписчики будут получать уведомления.
public interface Observer {
    void update(String category, String news);
}
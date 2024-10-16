package BehavioralPatterns2.Observer.WithPattern;

// Подписчик на планшете: получает уведомления обо всех новостях.
public class NewsSubscriberTablet implements Observer {
    @Override
    public void update(String category, String news) {
        // Планшет получает уведомления о любых новостях.
        System.out.println("Tablet received news: " + news);
    }
}

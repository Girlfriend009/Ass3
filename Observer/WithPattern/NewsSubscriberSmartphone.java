package BehavioralPatterns2.Observer.WithPattern;

// Подписчик на смартфоне: получает уведомления о новостях спорта.
public class NewsSubscriberSmartphone implements Observer {
    @Override
    public void update(String category, String news) {
        if (category.equals("Sport")) { // Только новости спорта интересуют смартфон.
            System.out.println("Smartphone received Sport news: " + news);
        }
    }
}
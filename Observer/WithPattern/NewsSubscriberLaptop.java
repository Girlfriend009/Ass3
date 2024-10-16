package BehavioralPatterns2.Observer.WithPattern;

// Подписчик на ноутбуке: получает уведомления о новостях науки.
public class NewsSubscriberLaptop implements Observer {
    @Override
    public void update(String category, String news) {
        if (category.equals("Science")) { // Ноутбук интересуют новости науки.
            System.out.println("Laptop received Science news: " + news);
        }
    }
}

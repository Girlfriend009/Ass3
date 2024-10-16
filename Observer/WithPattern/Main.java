package BehavioralPatterns2.Observer.WithPattern;

// Главный класс, демонстрирующий работу паттерна Наблюдатель.
public class Main {
    public static void main(String[] args) {
        // Создаем издателя новостей.
        NewsPublisherImpl newsPublisher = new NewsPublisherImpl();

        // Создаем подписчиков.
        Observer smartphone = new NewsSubscriberSmartphone();
        Observer laptop = new NewsSubscriberLaptop();
        Observer tablet = new NewsSubscriberTablet();

        // Добавляем подписчиков к издателю.
        newsPublisher.addSubscriber(smartphone);
        newsPublisher.addSubscriber(laptop);
        newsPublisher.addSubscriber(tablet);

        // Публикуем новости и проверяем, кто получил уведомление.
        newsPublisher.notifySubscribers("Sport", "New football match announced!");
        newsPublisher.notifySubscribers("Science", "New discovery in space!");
    }
}
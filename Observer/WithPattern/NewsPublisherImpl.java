package BehavioralPatterns2.Observer.WithPattern;

// Реализация издателя новостей, управляющего списком подписчиков и уведомлениями.
import java.util.ArrayList;
import java.util.List;

public class NewsPublisherImpl implements NewsPublisher {
    private List<Observer> subscribers = new ArrayList<>(); // Список подписчиков.

    @Override
    public void addSubscriber(Observer observer) {
        subscribers.add(observer); // Добавление нового подписчика в список.
    }

    @Override
    public void removeSubscriber(Observer observer) {
        subscribers.remove(observer); // Удаление подписчика из списка.
    }

    @Override
    public void notifySubscribers(String category, String news) {
        // Проходим по каждому подписчику и уведомляем его, если категория ему интересна.
        for (Observer subscriber : subscribers) {
            subscriber.update(category, news);
        }
    }
}
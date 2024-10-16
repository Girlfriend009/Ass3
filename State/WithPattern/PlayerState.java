package BehavioralPatterns2.State.WithPattern;

// Интерфейс PlayerState: описывает поведение плеера в разных состояниях.
public interface PlayerState {
    void play();  // Метод для начала воспроизведения.
    void pause(); // Метод для постановки на паузу.
    void stop();  // Метод для остановки воспроизведения.
}

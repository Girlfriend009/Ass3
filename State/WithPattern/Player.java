package BehavioralPatterns2.State.WithPattern;

// Класс Player: управляет текущим состоянием и переключает их.
public class Player {
    private PlayerState playingState;
    private PlayerState pausedState;
    private PlayerState stoppedState;

    private PlayerState currentState; // Текущее состояние плеера.

    public Player() {
        // Инициализируем все возможные состояния плеера.
        playingState = new PlayingState(this);
        pausedState = new PausedState(this);
        stoppedState = new StoppedState(this);

        // По умолчанию плеер находится в состоянии остановки.
        currentState = stoppedState;
    }

    // Меняем текущее состояние плеера.
    public void setState(PlayerState state) {
        currentState = state;
    }

    // Метод для воспроизведения аудио.
    public void play() {
        currentState.play();
    }

    // Метод для постановки на паузу.
    public void pause() {
        currentState.pause();
    }

    // Метод для остановки воспроизведения.
    public void stop() {
        currentState.stop();
    }

    // Методы для получения разных состояний плеера.
    public PlayerState getPlayingState() {
        return playingState;
    }

    public PlayerState getPausedState() {
        return pausedState;
    }

    public PlayerState getStoppedState() {
        return stoppedState;
    }
}
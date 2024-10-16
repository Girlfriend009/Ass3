package BehavioralPatterns2.State.WithPattern;

// Состояние остановки: воспроизведение полностью остановлено.
public class StoppedState implements PlayerState {
    private final Player player;

    public StoppedState(Player player) {
        this.player = player;
    }

    @Override
    public void play() {
        System.out.println("Starting playback from the beginning."); // Начинаем с начала.
        player.setState(player.getPlayingState()); // Переводим плеер в режим воспроизведения.
    }

    @Override
    public void pause() {
        System.out.println("Can't pause, player is stopped."); // Нельзя поставить на паузу.
    }

    @Override
    public void stop() {
        System.out.println("Already stopped."); // Плеер уже остановлен.
    }
}
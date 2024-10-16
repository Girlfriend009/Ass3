package BehavioralPatterns2.State.WithPattern;

// Состояние паузы: плеер на паузе.
public class PausedState implements PlayerState {
    private final Player player;

    public PausedState(Player player) {
        this.player = player;
    }

    @Override
    public void play() {
        System.out.println("Resuming playback."); // Возобновляем воспроизведение.
        player.setState(player.getPlayingState()); // Плеер возвращается в состояние воспроизведения.
    }

    @Override
    public void pause() {
        System.out.println("Already paused."); // Плеер уже на паузе.
    }

    @Override
    public void stop() {
        System.out.println("Stopping playback."); // Останавливаем плеер.
        player.setState(player.getStoppedState()); // Меняем состояние на остановку.
    }
}

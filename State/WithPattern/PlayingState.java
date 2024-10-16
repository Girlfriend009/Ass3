package BehavioralPatterns2.State.WithPattern;

// Состояние воспроизведения: плеер воспроизводит аудио.
public class PlayingState implements PlayerState {
    private final Player player; // Ссылка на основной объект плеера.

    public PlayingState(Player player) {
        this.player = player;
    }

    @Override
    public void play() {
        System.out.println("Already playing."); // Плеер уже воспроизводит.
    }

    @Override
    public void pause() {
        System.out.println("Pausing playback."); // Плеер ставится на паузу.
        player.setState(player.getPausedState()); // Меняем состояние плеера на паузу.
    }

    @Override
    public void stop() {
        System.out.println("Stopping playback."); // Воспроизведение полностью останавливается.
        player.setState(player.getStoppedState()); // Меняем состояние на остановку.
    }
}
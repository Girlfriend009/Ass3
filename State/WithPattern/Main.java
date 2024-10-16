package BehavioralPatterns2.State.WithPattern;

// Главный класс для тестирования плеера.
public class Main {
    public static void main(String[] args) {
        Player player = new Player(); // Создаем объект плеера.

        player.play();  // Плеер начинает воспроизведение.
        player.pause(); // Плеер ставится на паузу.
        player.play();  // Плеер возобновляет воспроизведение.
        player.stop();  // Плеер останавливается.
    }
}
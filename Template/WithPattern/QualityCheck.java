package BehavioralPatterns2.Template.WithPattern;

// Абстрактный класс QualityCheck: шаблонный метод для проверки качества продуктов.
public abstract class QualityCheck {
    // Шаблонный метод, описывающий общий алгоритм проверки.
    public final void checkProduct() {
        checkAppearance(); // Первый шаг: проверка внешнего вида.
        checkCharacteristics(); // Второй шаг: проверка характеристик (определяется в подклассах).
        finalReport(); // Третий шаг: заключительный отчёт.
    }

    // Метод для проверки внешнего вида (одинаков для всех продуктов).
    private void checkAppearance() {
        System.out.println("Checking appearance...");
    }

    // Абстрактный метод для проверки специфических характеристик.
    protected abstract void checkCharacteristics();

    // Метод для формирования итогового отчёта (одинаков для всех продуктов).
    private void finalReport() {
        System.out.println("Generating final report...");
    }
}
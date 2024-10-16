package BehavioralPatterns2.Template.WithPattern;

// Главный класс для тестирования шаблонного метода.
public class Main {
    public static void main(String[] args) {
        // Проверка качества для продуктов питания.
        QualityCheck foodCheck = new FoodQualityCheck();
        foodCheck.checkProduct();

        // Проверка качества для электроники.
        QualityCheck electronicsCheck = new ElectronicsQualityCheck();
        electronicsCheck.checkProduct();
    }
}
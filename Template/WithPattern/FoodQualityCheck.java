package BehavioralPatterns2.Template.WithPattern;

// Класс FoodQualityCheck: реализация проверки для продуктов питания.
public class FoodQualityCheck extends QualityCheck {
    @Override
    protected void checkCharacteristics() {
        System.out.println("Checking expiration date and ingredients."); // Проверка срока годности и состава.
    }
}
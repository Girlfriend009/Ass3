package BehavioralPatterns2.Template.WithPattern;

// Класс ElectronicsQualityCheck: реализация проверки для электроники.
public class ElectronicsQualityCheck extends QualityCheck {
    @Override
    protected void checkCharacteristics() {
        System.out.println("Checking functionality and warranty."); // Проверка работоспособности и гарантии.
    }
}

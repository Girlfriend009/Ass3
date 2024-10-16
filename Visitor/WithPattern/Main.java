package BehavioralPatterns2.Visitor.WithPattern;

// Главный класс для тестирования паттерна Посетитель.
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<File> files = new ArrayList<>(); // Создаём список файлов.
        files.add(new TextFile("Document content")); // Добавляем текстовый файл.
        files.add(new ExecutableFile("Binary data")); // Добавляем исполняемый файл.

        Visitor antivirus = new AntivirusVisitor(); // Создаём антивирусного посетителя.
        Visitor reportGenerator = new ReportVisitor(); // Создаём посетителя для генерации отчётов.

        // Применяем посетителей ко всем файлам.
        for (File file : files) {
            file.accept(antivirus); // Антивирусная проверка.
            file.accept(reportGenerator); // Генерация отчётов.
        }
    }
}
package BehavioralPatterns2.Visitor.WithPattern;

// Класс AntivirusVisitor: выполняет антивирусную проверку файлов.
public class AntivirusVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Scanning text file for forbidden words..."); // Проверка текстового файла.
        // Логика для сканирования текстовых файлов.
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Scanning executable file for malicious code..."); // Проверка исполняемого файла.
        // Логика для сканирования исполняемых файлов.
    }
}

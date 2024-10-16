package BehavioralPatterns2.Visitor.WithPattern;

// Интерфейс Visitor: описывает поведение для каждого типа файла.
public interface Visitor {
    void visit(TextFile textFile);  // Метод для посещения текстовых файлов.
    void visit(ExecutableFile executableFile); // Метод для посещения исполняемых файлов.
}


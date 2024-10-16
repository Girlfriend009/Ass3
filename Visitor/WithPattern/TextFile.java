package BehavioralPatterns2.Visitor.WithPattern;

// Класс TextFile: представляет текстовый файл.
public class TextFile implements File {
    private String content;

    public TextFile(String content) {
        this.content = content;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // Принятие посетителя.
    }

    public String getContent() {
        return content; // Получение содержимого текстового файла.
    }
}
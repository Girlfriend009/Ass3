package BehavioralPatterns2.Visitor.WithPattern;

// Класс ExecutableFile: представляет исполняемый файл.
public class ExecutableFile implements File {
    private String binaryData;

    public ExecutableFile(String binaryData) {
        this.binaryData = binaryData;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // Принятие посетителя.
    }

    public String getBinaryData() {
        return binaryData; // Получение данных исполняемого файла.
    }
}
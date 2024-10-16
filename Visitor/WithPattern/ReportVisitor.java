package BehavioralPatterns2.Visitor.WithPattern;

// Класс ReportVisitor: генерирует отчёт по проверке файлов.
public class ReportVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Generating report for text file."); // Генерация отчёта для текстового файла.
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Generating report for executable file."); // Генерация отчёта для исполняемого файла.
    }
}

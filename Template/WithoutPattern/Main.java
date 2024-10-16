package BehavioralPatterns2.Template.WithoutPattern;

public class Main {
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareTea();  // Готовим чай

        Coffee coffee = new Coffee();
        coffee.prepareCoffee();  // Готовим кофе
    }
}








//Проблемы такого подхода:
//Дублирование кода: Логика кипячения воды, наливания напитка в чашку дублируется в обоих классах.
//Трудности с расширением: Если нужно изменить общий процесс (например, добавить приветственное сообщение),
// придётся менять все классы.
//Нарушение принципа DRY (Don’t Repeat Yourself): Код дублируется, а это усложняет поддержку.
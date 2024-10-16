package BehavioralPatterns2.State.WithoutPattern;

public class Main {
    public static void main(String[] args) {
        // Создаем автомат с запасом напитков
        VendingMachine machine = new VendingMachine(true);

        // Выдача напитка
        machine.dispenseDrink();  // "Напиток выдан."

        // Попытка получить напиток, когда автомат пуст
        machine.dispenseDrink();  // "Извините, напитков нет."

        // Пополняем автомат
        machine.refill();  // "Автомат пополнен."

        // Снова выдаем напиток
        machine.dispenseDrink();  // "Напиток выдан."
    }
}
//Проблема: Логика работы автомата реализована через условные операторы (if),
// что делает код менее гибким и сложным для расширения.
// Добавление новых состояний усложнит логику, и придется добавлять новые условия.
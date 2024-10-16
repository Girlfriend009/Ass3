package BehavioralPatterns2.State.WithoutPattern;

//Предположим, у нас есть автомат по продаже напитков,
// который ведет себя по-разному в зависимости от того, есть ли в нем напитки или нет.
public class VendingMachine {
    private boolean hasStock;  // Есть ли напитки в автомате

    public VendingMachine(boolean hasStock) {
        this.hasStock = hasStock;
    }

    // Метод для покупки напитка
    public void dispenseDrink() {
        if (hasStock) {
            System.out.println("Напиток выдан.");
            hasStock = false;  // Напитки закончились после выдачи
        } else {
            System.out.println("Извините, напитков нет.");
        }
    }

    // Пополнение запасов напитков
    public void refill() {
        hasStock = true;
        System.out.println("Автомат пополнен.");
    }
}

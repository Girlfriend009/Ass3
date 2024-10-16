package BehavioralPatterns2.Template.WithoutPattern;

//Предположим, у нас есть приложение, которое готовит напитки — чай и кофе.
// Каждый из них готовится схожим образом, но есть различия в процессе заваривания и добавления ингредиентов.

public class Tea {
    public void prepareTea() {
        boilWater();
        steepTea();
        pourInCup();
        addLemon();
    }

    private void boilWater() {
        System.out.println("Кипятим воду.");
    }

    private void steepTea() {
        System.out.println("Завариваем чай.");
    }

    private void pourInCup() {
        System.out.println("Наливаем чай в чашку.");
    }

    private void addLemon() {
        System.out.println("Добавляем лимон.");
    }
}

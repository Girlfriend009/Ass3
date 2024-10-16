package BehavioralPatterns2.Template.WithoutPattern;

public class Coffee {
    public void prepareCoffee() {
        boilWater();
        brewCoffee();
        pourInCup();
        addSugarAndMilk();
    }

    private void boilWater() {
        System.out.println("Кипятим воду.");
    }

    private void brewCoffee() {
        System.out.println("Завариваем кофе.");
    }

    private void pourInCup() {
        System.out.println("Наливаем кофе в чашку.");
    }

    private void addSugarAndMilk() {
        System.out.println("Добавляем сахар и молоко.");
    }
}

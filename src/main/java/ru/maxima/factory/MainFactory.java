package ru.maxima.factory;

public class MainFactory {
    public static void main(String[] args) {
        Coffee espresso = CoffeeFactory.getCoffee(CoffeeType.ESPRESSO);
        espresso.printName();
        Coffee americano = CoffeeFactory.getCoffee(CoffeeType.AMERICANO);
        americano.printName();
    }
}

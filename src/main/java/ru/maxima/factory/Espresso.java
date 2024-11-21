package ru.maxima.factory;

public class Espresso implements Coffee {
    @Override
    public void printName() {
        System.out.println("Espresso");
    }
}

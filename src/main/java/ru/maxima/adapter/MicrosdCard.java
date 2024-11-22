package ru.maxima.adapter;

public class MicrosdCard implements MemoryCard {
    @Override
    public void set() {
        System.out.println("Microsd");
    }
}

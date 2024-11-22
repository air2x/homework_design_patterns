package ru.maxima.adapter;

public class Usb implements Port {
    @Override
    public void set() {
        System.out.println("USB");
    }
}

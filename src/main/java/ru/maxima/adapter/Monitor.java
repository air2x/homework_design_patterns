package ru.maxima.adapter;

public class Monitor {
    public void connect(Port port) {
        port.set();
        System.out.println("Внешний накопитель подключен");
    }
}

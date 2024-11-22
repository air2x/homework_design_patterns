package ru.maxima.proxy;

public class DatabaseImpl implements Database {

    private String name;

    public DatabaseImpl(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println("Подключено localhost:port/" + name);
    }
}

package ru.maxima.proxy;

public class MainProxy {
    public static void main(String[] args) {
        Database database1 = new DatabaseImpl("db");
        database1.connect();

        Database database = new DatabaseProxy("db", "localhost", 8080);
        database.connect();
    }
}

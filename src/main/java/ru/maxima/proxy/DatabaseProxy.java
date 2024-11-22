package ru.maxima.proxy;

public class DatabaseProxy implements  Database {
    private DatabaseImpl databaseImpl;
    private String name;
    private String host;
    private int port;

    public DatabaseProxy(String name, String host, int port) {
        this.name = name;
        this.host = host;
        this.port = port;
    }

    @Override
    public void connect() {
        if (databaseImpl == null) {
            String fullName = host + ":" + port + "/" + name;
            databaseImpl = new DatabaseImpl(fullName);
        }
        databaseImpl.connect();
    }
}

package ru.maxima.singelton;

public class MainSingelton {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.classLogg(new Cat(), "Cat class");
        logger.classLogg(new Dog(), "Dog class");
    }
}

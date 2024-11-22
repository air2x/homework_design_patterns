package ru.maxima.adapter;

public class MainAdapter {
    public static void main(String[] args) {
        Usb usbCard = new Usb();
        Monitor monitor1 = new Monitor();
        monitor1.connect(usbCard);

        MicrosdCard microsdCard = new MicrosdCard();
        MicrosdAdapter microsdAdapter = new MicrosdAdapter(microsdCard);
        Monitor monitor3 = new Monitor();
        monitor3.connect(microsdAdapter);
    }
}

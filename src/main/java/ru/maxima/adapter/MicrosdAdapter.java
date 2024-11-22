package ru.maxima.adapter;

public class MicrosdAdapter implements Port {
    private final MicrosdCard microsdCard;

    public MicrosdAdapter(MicrosdCard microsdCard) {
        this.microsdCard = microsdCard;
    }

    @Override
    public void set() {
        microsdCard.set();
    }
}

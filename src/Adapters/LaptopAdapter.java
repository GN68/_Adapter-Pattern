package Adapters;

import Adaptees.Laptop;
import interfaces.Adapter;

public class LaptopAdapter implements Adapter {
    Laptop laptop;
    @Override
    public void plugIn() {
        laptop.charge();
    }

    public LaptopAdapter(Laptop laptop) {
        this.laptop = laptop;
    }
}

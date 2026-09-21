package Adapters;

import Adaptees.Fridge;
import Adaptees.Laptop;
import interfaces.Adapter;

public class RefrigeratorAdapter implements Adapter {
    Fridge fridge;
    @Override
    public void plugIn() {
        fridge.startCooling();
    }

    public RefrigeratorAdapter(Fridge fridge) {
        this.fridge = fridge;
    }
}

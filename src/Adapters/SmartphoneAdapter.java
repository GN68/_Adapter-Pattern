package Adapters;

import Adaptees.Fridge;
import Adaptees.SmartphoneCharger;
import interfaces.Adapter;

public class SmartphoneAdapter implements Adapter {
    SmartphoneCharger charger;
    @Override
    public void plugIn() {
        charger.chargePhone();
    }

    public SmartphoneAdapter(SmartphoneCharger charger) {
        this.charger = charger;
    }
}

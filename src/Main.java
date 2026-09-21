import Adaptees.Fridge;
import Adaptees.Laptop;
import Adaptees.SmartphoneCharger;
import Adapters.LaptopAdapter;
import Adapters.RefrigeratorAdapter;
import Adapters.SmartphoneAdapter;

public class Main {
    static void main() {
        LaptopAdapter laptopAdapter = new LaptopAdapter(new Laptop());
        RefrigeratorAdapter refrigeratorAdapter = new RefrigeratorAdapter(new Fridge());
        SmartphoneAdapter smartphoneAdapter = new SmartphoneAdapter(new SmartphoneCharger());

        laptopAdapter.plugIn();
        refrigeratorAdapter.plugIn();
        smartphoneAdapter.plugIn();
    }
}

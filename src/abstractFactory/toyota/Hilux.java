package abstractFactory.toyota;

import abstractFactory.Truck;

public class Hilux extends Truck {
    @Override
    public void activateFWD() {
        System.out.println("Activate FWD Hilux");
    }
}

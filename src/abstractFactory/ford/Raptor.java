package abstractFactory.ford;

import abstractFactory.Truck;

public class Raptor extends Truck {
    @Override
    public void activateFWD() {
        System.out.println("Raptor FWD activated");
    }
}

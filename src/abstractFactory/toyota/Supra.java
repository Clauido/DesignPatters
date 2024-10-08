package abstractFactory.toyota;

import abstractFactory.SportCar;

public class Supra extends SportCar {
    @Override
    public void accelerate() {
        System.out.println("Supra accelerating");
    }
}

package abstractFactory;

import abstractFactory.ford.Mustang;
import abstractFactory.ford.Raptor;

public class FordFactory implements AbstractFactory {
    @Override
    public SportCar createSportCar() {
        return new Mustang();
    }

    @Override
    public Truck createTruck() {
        return new Raptor();
    }
}

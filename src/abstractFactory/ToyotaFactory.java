package abstractFactory;

import abstractFactory.toyota.Hilux;
import abstractFactory.toyota.Supra;

public class ToyotaFactory implements AbstractFactory{
    @Override
    public SportCar createSportCar() {
        return new Supra();
    }
    public Truck createTruck() {
        return new Hilux();
    }
}

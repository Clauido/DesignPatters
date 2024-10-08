package adapter;

public class Truck implements Vehicle {

    @Override
    public void forward() {
        System.out.println("Truck forward");
    }

    @Override
    public void backward() {
        System.out.println("Truck backward");
    }

    @Override
    public void brake() {
        System.out.println("Truck brake");
    }
}

package adapter;

public class Car implements Vehicle {

    @Override
    public void forward() {
        System.out.println("Setting Direct and Pressing Accerate peddal");
    }

    @Override
    public void backward() {
        System.out.println("Setting reverse gear and acelerating");
    }

    @Override
    public void brake() {
        System.out.println("Braking with handbrake");
    }

}

package adapter;

public class BikeAdapter implements Vehicle {
    private Bike bike;
    public BikeAdapter() {
        super();
        this.bike = new Bike();
    }

    @Override
    public void forward() {
            bike.pedaling();
    }

    @Override
    public void backward() {
        bike.walkingBackward();
    }

    @Override
    public void brake() {
        bike.brake();
    }
}

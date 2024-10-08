package Bridge;

public abstract class Media {
    protected Device device;

    protected Media(Device device) {
        this.device = device;
    }
    public abstract void play();
}

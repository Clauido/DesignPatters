package factory;
/*
 *
 * Paso N°4
 *
 * */
public class MitsubishiFactory implements FactoryBase{
    public Car Create() {
        return new Mitsubishi();
    }
}

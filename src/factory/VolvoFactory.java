package factory;
/*
 *
 * Paso N°4
 *
 * */
public class VolvoFactory implements FactoryBase {
    public Car Create() {
        return new Volvo();
    }
}

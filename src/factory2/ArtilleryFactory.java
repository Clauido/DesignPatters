package factory2;

public class ArtilleryFactory implements PrinterFactory{
    @Override
    public Printer createPrinter() {
        return new ArtilleryPrinter();
    }
}

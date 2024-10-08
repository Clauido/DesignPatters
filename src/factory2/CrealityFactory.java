package factory2;

public class CrealityFactory implements PrinterFactory{
    public Printer createPrinter() {
        return new CrealityPrinter();
    }
}

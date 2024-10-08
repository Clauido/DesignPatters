import Singleton.Singleton;
import Strategy.CashMethod;
import Strategy.CreditMethod;
import Strategy.PaymentMethod;
import Strategy.PaypalMethod;
import abstractFactory.FordFactory;
import abstractFactory.SportCar;
import abstractFactory.ToyotaFactory;
import adapter.*;
import factory2.*;

public class Main {
    public static void main(String[] args) {
        PaymentMethod cashMethod= new CashMethod();
        PaymentMethod creditMethod= new CreditMethod();
        PaymentMethod paypalMethod= new PaypalMethod();

        cashMethod.pay(100);
        cashMethod.pay(200);
        creditMethod.pay(100);


    }
}
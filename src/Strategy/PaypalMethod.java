package Strategy;

public class PaypalMethod implements PaymentMethod {
    public void pay(int amount){
        System.out.println("Paypal method payed "+amount);
    }
}

package Strategy;

public class CashMethod implements PaymentMethod {
    public void pay(int amount){
        System.out.println("CashMethod pay" + amount);
    }
}

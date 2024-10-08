package Strategy;

public class CreditMethod implements PaymentMethod{
    public void pay(int amount){
        System.out.println("Credit Method pay" + amount);
    }
}

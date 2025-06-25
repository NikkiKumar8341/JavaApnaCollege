package SOLID_Principle.DIP;

public class CreditCard implements BankCard{


    @Override
    public void doTransaction(int amount) {
        System.out.println("Payment using Credit card");
    }
}

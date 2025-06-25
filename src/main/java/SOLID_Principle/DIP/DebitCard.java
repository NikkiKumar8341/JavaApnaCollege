package SOLID_Principle.DIP;

public class DebitCard implements BankCard{
    @Override
    public void doTransaction(int amount) {
        System.out.println("Payment do using DebitCard");
    }
}

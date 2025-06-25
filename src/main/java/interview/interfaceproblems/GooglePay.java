package interview.interfaceproblems;

public class GooglePay implements Payment{

    @Override
    public void doTransaction() {
        System.out.println("do transaction in GooglePay");
    }
}

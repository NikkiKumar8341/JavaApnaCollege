package interview.interfaceproblems;

public class PhonePe implements Payment{

    @Override
    public void doTransaction() {
        System.out.println("do Tranaction in phonePe");
    }

    public void addCoupon(){
        System.out.println("add 10 cashback");
    }
}

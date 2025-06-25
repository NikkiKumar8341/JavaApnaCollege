package interview.interfaceproblems;

public class PaymentMode {


    public static void main(String[] args) {

        GooglePay googlePay=new GooglePay();
        googlePay.doTransaction();
        googlePay.addCoupon();

        Payment phonePe=new PhonePe();
        Payment.generateTransactionReport();
        phonePe.doTransaction();
        phonePe.addCoupon();
    }
}

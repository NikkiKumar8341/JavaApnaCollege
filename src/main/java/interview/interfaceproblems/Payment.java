package interview.interfaceproblems;

public interface Payment {


    public void doTransaction();

    /**
     * ignore if you don't want to add any addCoupon features in any of tour impl
     * directly access from super class,if you want to use same impl
     * @override addCoupon method if you want to provide different impl
     * if onething is common for all implemation keep it as static
     */

    default void addCoupon(){
        System.out.println("add 5 Rs cashBack");
    }

    static void generateTransactionReport(){
        System.out.println("generate each transaction report");
    }

}

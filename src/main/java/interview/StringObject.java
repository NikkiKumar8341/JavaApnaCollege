package interview;

public class StringObject {


    public static void main(String[] args) {

        //how many object created here
        String s1=new String("nikhil kumar");
        //1 object  -->new -->heap

        //2 Object -->literal -->scp(String contant pool area)
        //itern method used to get reference from scp
        String s2="nikhil kumar";

        //total object count is 2 bacause of string constant pool area

        System.out.println(s1.intern().hashCode()==s2.hashCode());
        /**
         * why string is immutable in java
         */

        String s="java";//
        String s12= s.concat("techie");//concat(
        System.out.println(s);

        System.out.println(s12);

    }
}

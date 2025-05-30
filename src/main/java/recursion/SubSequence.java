package recursion;

import java.util.ArrayList;

public class SubSequence {

    public static void main(String[] args) {

        subSeq("","abc");

        ArrayList<String> list=subSeqList("","abc");

        for (String myList:list){
            System.out.println(myList);
        }



        System.out.println("tailing ways"+tailingProblem(5));


        System.out.println("friend pairing "+frinendPairing(3));



    }


    public static void subSeq(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);

        subSeq(p+ch,up.substring(1));
        subSeq(p,up.substring(1));
    }


    public static ArrayList<String> subSeqList(String p,String up){

        if (up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch=up.charAt(0);

        ArrayList<String> left=subSeqList(p+ch,up.substring(1));
        ArrayList<String> right=subSeqList(p,up.substring(1));

        left.addAll(right);

        return left;

    }

    public static int tailingProblem(int n){
        if (n==0||n==1){
            return 1;
        }

        //vertical tailing
        int vertical=tailingProblem(n-1);

        //horizonal

        int horizonal=tailingProblem(n-2);

        int twoWays=vertical+horizonal;

        return twoWays;
    }

    public static int frinendPairing(int n){
        if(n==1 ||n==2){
            return n;
        }


        //single
        int single=frinendPairing(n-1);


        //pair

        int pair=frinendPairing(n-2);

        int pairWays=(n-1)*pair;

        //toways
        int toWays=single+pairWays;

        return toWays;




    }

}

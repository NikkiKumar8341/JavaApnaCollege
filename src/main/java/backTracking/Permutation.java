package backTracking;

public class Permutation {


    public static void main(String[] args) {

        finPermutation("abc","");
    }


    public static void finPermutation(String str,String ans){

        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        for (int i=0;i<str.length();i++){
            char curr=str.charAt(i);


            //delete the character from the string
            String newStr=str.substring(0,i)+str.substring(i+1);

            finPermutation(newStr,ans+curr);

        }

    }
}

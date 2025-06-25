package Java8Feature.basicTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {


    public static void reverseWord_Space(String s){

        String[] words = s.split(" ");

        StringBuilder reversedStr = new StringBuilder();

        for (String word:words){
           StringBuilder reversedWord=new StringBuilder(word);
           reversedStr.append(reversedWord.reverse().toString()).append(" ");
        }

        System.out.println(reversedStr.toString());


//
//        for (String word : words){
//            StringBuilder reversedWord=new StringBuilder(word);
//            reversedStr.append(reversedWord.reverse().toString()).append(" ");
//        }
//
//        System.out.println("reversed Sentence : "+reversedStr.toString().trim());

    }


    public static boolean givenPailndrome(String str){

        int s=0;
        int e=str.length()-1;

       while (s<e){
           if(str.charAt(s)==str.charAt(e)){
               s++;
               e--;
           }else {
               return false;
           }
       }
        return true;

    }

    public static boolean isAlphabetOnly(String str){

        boolean ispresent=true;

        for (char ch:str.toCharArray()){
            if (Character.isDigit(ch)){
                return false;
            }
        }


        return ispresent;
    }

    public static void main(String[] args) {
        int[] array2={1,8,5,6,3,4,10};

        List<Integer> sum2 = Arrays.stream(array2).boxed().map(n -> n*2).collect(Collectors.toList());

        System.out.println(sum2);

        String str="nikhil kumar goud";

        reverseWord_Space(str);

        String pal="abbaa";

        System.out.println(givenPailndrome(pal));
    }
}

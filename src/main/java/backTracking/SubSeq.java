package backTracking;

public class SubSeq {


    public static void main(String[] args) {
        findSubSets("abc","",0);
    }



    public static void findSubSets(String str,String ans,int i){
        if (i==str.length()){
            System.out.println(ans);
            return;
        }

        //yes choice
        findSubSets(str,ans+str.charAt(i),i+1);

        //No Choice
        findSubSets(str,ans,i+1);

    }
}

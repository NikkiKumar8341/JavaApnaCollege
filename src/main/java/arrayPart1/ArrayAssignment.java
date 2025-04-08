package arrayPart1;

import java.util.HashMap;
import java.util.Map;

public class ArrayAssignment {


    public static boolean noDuplicate(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();


        for (int i=0;i< arr.length;i++){
            int value=map.getOrDefault(arr[i],0);
            map.put(arr[i],value+1);
        }

        boolean hasDuplicateValue = false;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() > 1) {
                hasDuplicateValue = true;
                break;
            }
        }

        return hasDuplicateValue;
    }


    public static void pairSum(int[] arr){

        int count=0;
        for(int i=0;i< arr.length;i++){
            for(int j=i;j< arr.length;j++){

                for (int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                count++;
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("total count : "+count);
    }

    public static void main(String[] args) {

        int[] map={1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        int[] map1={1, 2, 3, 4};

        boolean b = noDuplicate(map1);

        System.out.println(b+" there are repeated values in map array");

        int[] arr={1,2,3,4};

        pairSum(arr);

    }
}

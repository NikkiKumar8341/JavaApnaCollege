package recursion;

import java.util.ArrayList;

public class SortedRecursion {


    public static void main(String[] args) {
        int[] arr={1,2,1,3,4};

        System.out.println(sorted(arr,0));

        System.out.println(findNumber(arr,5,0));

        System.out.println(findInt(arr,25,0));

        int[] arr1={1,24,4,4,4,4,6,7,7};

        ArrayList<Integer> list=finAllIndex(arr1,4,0,new ArrayList<>());



        System.out.println(list);

        System.out.println("all number in array");

        for (Integer allIndex : findAllIndexs(arr1, 7, 0)) {
            System.out.println(allIndex);
        }

    }

    public static boolean sorted(int[] arr,int index){

        if (index== arr.length-1){
            return true;
        }

        return arr[index]<arr[index+1] && sorted(arr, index+1);
    }


    public static boolean findNumber(int[] arr,int target,int index){
        if (index==arr.length){
            return false;
        }

        return arr[index]==target || findNumber(arr, target, index+1);
    }

    public static int findInt(int[] arr,int target,int index){
        if (index==arr.length){
            return -1;
        }

        if (arr[index]==target){
            return index;
        }else {
            return findInt(arr, target, index+1);
        }
    }


    public static ArrayList<Integer> finAllIndex(int[] arr,int target,int index,ArrayList<Integer> list){

        if (index==arr.length){
            return list;
        }

        if (arr[index]==target){
            list.add(index);
        }

        return finAllIndex(arr, target, index+1, list);
    }

    public static ArrayList<Integer> findAllIndexs(int[] arr,int target,int index){

        ArrayList<Integer> list=new ArrayList<>();

        if (index==arr.length){
            return list;
        }

        if (arr[index]==target){
            list.add(index);
        }

        ArrayList<Integer> andFromBelowCalls=findAllIndexs(arr, target, index+1);

        list.addAll(andFromBelowCalls);

        return list;
    }
}

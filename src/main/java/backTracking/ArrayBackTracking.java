package backTracking;

public class ArrayBackTracking {


    public static void main(String[] args) {

        int[] arr=new int[5];
        backTrackArray(arr,1,0);
        System.out.println();
        printArr(arr);

    }


    public static void backTrackArray(int[] arr,int value,int index){

        if (index==arr.length){
            printArr(arr);
            return;
        }

        arr[index]=value;
        backTrackArray(arr,value+1,index+1);
        arr[index]=arr[index]-2;
    }

    private static void printArr(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

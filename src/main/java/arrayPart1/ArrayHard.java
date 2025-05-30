package arrayPart1;

public class ArrayHard {


    //leetcode problem number 75
    public static void colorSort(int[] nums){
        int low=0,mid=0,high= nums.length-1;

        while(mid<=high){
            if (nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;

            } else if (nums[mid]==1) {
                mid++;
            }else {
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }

    }

    public static void printInc(int n){

        if (n==1){
            System.out.print(n+" ");
            return;
        }

        printInc(n-1);
        System.out.print(n+" ");
    }


    public static void main(String[] args) {

        int[] arr={0,1,2,0,1,2,0,1,0};

        colorSort(arr);

        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("print recusrion in increse order");

        printInc(5);
    }
}

package recursion;

public class RoatedArrayBs {


    public static void main(String[] args) {

        int[] arr={5,6,7,8,9,1,2,3};

        System.out.println(searchRoatated(arr,2,0,arr.length-1));

        int[] isSortedArray={1,2,3,4,5,6};


        System.out.println("is array is sorted  : "+isArraySorted(isSortedArray,0));


        System.out.println("first occurence of 2 : "+firstOccurence(arr,2,0));
    }

    public static boolean isArraySorted(int[] arr,int index){

        if (index==arr.length-1){
            return true;
        }

        return arr[index]<arr[index+1] && isArraySorted(arr,index+1);
    }

    public static int firstOccurence(int[] arr,int target,int index){

        if (index==arr.length-1){
            return -1;
        }

        if (arr[index]==target){
            return index;
        }
        return firstOccurence(arr,target,index+1);
    }



    public static int searchRoatated(int[] arr,int key ,int s,int e){

        if (s>e){
            return -1;
        }

        int mid=s+(e-s)/2;

        if(arr[mid]==key){
            return mid;
        }


        //right side is sorted
        if (arr[s]<=arr[mid]){
            if (key>=arr[s] && key<=arr[mid]){
                return searchRoatated(arr,key,s,mid-1);
            }else {
                return searchRoatated(arr,key,mid+1,e);
            }
        }


        if (key>=arr[mid] && key<=arr[e]){
            return searchRoatated(arr,key,mid+1,e);
        }
        return searchRoatated(arr, key, s, mid-1);

    }
}

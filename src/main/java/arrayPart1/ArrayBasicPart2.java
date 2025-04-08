package arrayPart1;

public class ArrayBasicPart2 {


    public static int trappedRainWater(int[] height){
        int n=height.length;

        //left max
        int[] leftMax=new int[n];
        leftMax[0]=height[0];

        for (int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }

        //right max
        int[] rightMax=new int[n];
        rightMax[n-1]=height[n-1];

        for (int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        //trappedWater
        int trappedWater=0;

        for (int i=0;i<n;i++){

            //calculate water level
            int waterLevel=Math.min(leftMax[i],rightMax[i]);

            //calculate trapped water
            trappedWater+=waterLevel-height[i];
        }

        return trappedWater;

    }


    public static int mostWater(int[] container){

        int maxWater=0;

        int n= container.length-1;

        for (int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){

                int width=j-i;

                int height=Math.min(container[i],container[j]);

                int area=width*height;

                maxWater=Math.max(area,maxWater);

            }
        }

        return maxWater;
    }

    public static int twoPointerWater(int[] container){
        int n=container.length-1;
        int left=0,right=n-1;
        int maxWater=0;

        while (left<right){

            int width=right-left;
            int height=Math.min(container[left],container[right]);

            int area=width*height;

            maxWater=Math.max(area,maxWater);

            if(container[left]<container[right]){
                left++;
            }else {
                right--;
            }

        }

        return maxWater;
    }

    public static void main(String[] args) {
        int[] height={4,2,0,6,3,2,5};

        trappedRainWater(height);

        int[] container={1,8,6,2,5,4,8,3,7};

        int maxWaterInContainer=mostWater(container);

        System.out.println("max water in container : "+maxWaterInContainer);


        int mostWater = twoPointerWater(container);

        System.out.println("max water in container two pointer :"+mostWater);
    }
}

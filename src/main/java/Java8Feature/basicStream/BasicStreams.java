package Java8Feature.basicStream;

import java.util.*;

public class BasicStreams {


    public static void removeDup(int[] arr){
        Set<Integer> rem=new HashSet<>();

        for (int i=0;i<arr.length;i++){
            if (!rem.contains(arr[i])){
                rem.add(arr[i]);
            }
        }

        System.out.println(rem);

        HashMap<Integer,Integer> mapSet=new HashMap<>();

        for (int i=0;i< arr.length;i++){
           int value=mapSet.getOrDefault(arr[i],0);
           mapSet.put(arr[i],value+1);
        }

        System.out.println(mapSet);
    }

    public static void maxSum(int[] arr){

        int maxsum=Integer.MIN_VALUE;


        for (int i=0;i<arr.length;i++){
            int sum=0;
            for (int j=i+1;j<arr.length;j++){
                sum+=arr[j];
                maxsum=Math.max(sum,maxsum);
            }
        }

        System.out.println(maxsum);

    }




    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Alice", 30, 65.5),
                new Person("Bob", 25, 75.0),
                new Person("Charlie", 35, 80.0),
                new Person("Alice" ,25,75.3)
        ));

        System.out.println("before sorting"+people);

        Collections.sort(people);

        System.out.println("after Collections : "+people);

        Collections.sort(people,new PersonNameComapator());

        System.out.println("sort by name :"+people);

        Collections.sort(people,new PersonAgeComparator());

        System.out.println("sort by age :"+people);

        people.sort(Comparator.comparing(Person::getName).thenComparing(Comparator.comparing(Person::getWeight).reversed()));

        System.out.println(" sort by nam and weight "+people);


        int [] arr={1,2,2,1,2,2,3};

        removeDup(arr);

        int[] maxArr={3,-4,5,4,-1,-7,8};


        maxSum(maxArr);


    }
}

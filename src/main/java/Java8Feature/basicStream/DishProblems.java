package Java8Feature.basicStream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class DishProblems {

    public enum CaloricLevel { DIET, NORMAL, FAT }


    public static List<Dish> getListOfDish(){
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),

                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );

        return menu;
    }

    public static void main(String[] args) {

        List<Dish> isVeg = getListOfDish().stream().filter(Dish::isVegetarian)
                .collect(Collectors.toList());

        System.out.println("veg dishes"+isVeg);

        isVeg.forEach(System.out::println);


        List<String>  calories300=getListOfDish().stream().filter(item -> item.getCalories() > 300).map(Dish::getName)
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Calories List"+calories300);


        List<String> collect = getListOfDish().stream().filter(item -> {
            System.out.println("filter item name: " + item.getName());
            return item.getCalories() > 500;
        }).map((item)->{
            System.out.println("map item name: "+item.getName());
            return item.getName();
                }

        ).limit(4).collect(Collectors.toList());

        System.out.println("Calories list > 500"+collect);

        long count = getListOfDish().stream().filter((item) -> item.getCalories() > 400).distinct().count();

        System.out.println(count);




       Optional<Dish> optionalDish= getListOfDish().stream().filter(Dish::isVegetarian).findAny();

        System.out.println(optionalDish);

        String[] arrayOfWords = {"Goodbye", "World"};

        List<String> collect1 = Arrays.stream(arrayOfWords)
                .map(n -> n.split(""))// Split each word into character arrays
                .flatMap(Arrays::stream)
                .collect(toList());//

        List<String> collect2 = Arrays.stream(arrayOfWords).map(n -> n.split(""))
                .flatMap(Arrays::stream)
                .collect(toList());

        collect2.forEach(arr -> System.out.print(arr));

        List<String>  calories30=getListOfDish().stream().filter(item -> item.getCalories() > 300).map(Dish::getName)
                .limit(3)
                .collect(Collectors.toList());


        System.out.println();


        List<Integer> integerList=getListOfDish().stream().filter((item)->{return item.getCalories()>400;}).map(Dish::getCalories).collect(toList());


        double average = integerList.stream().mapToInt(Integer::intValue).average().orElse(0.0);


        System.out.println("avg of item greater then 400"+average);

        Map<Dish.Type, List<Dish>> dishesByType = getListOfDish().stream().collect(groupingBy(Dish::getType));

       dishesByType.entrySet().forEach(System.out::println);


      Map<Dish.Type,Map<CaloricLevel, List<Dish>>> dishesByTypeCalories= getListOfDish().stream().collect(groupingBy(Dish::getType,groupingBy(dish -> {
           if(dish.getCalories()<=400){
               return CaloricLevel.DIET;
           } else if (dish.getCalories()<=700) {
               return CaloricLevel.NORMAL;
           }else {
               return CaloricLevel.FAT;
           }
       })));

        System.out.println(dishesByTypeCalories);

        Map<Boolean, List<Dish>> partitionByVeg = getListOfDish().stream().collect(partitioningBy(Dish::isVegetarian));


        List<Dish> dishes = partitionByVeg.get(true);




    }




}

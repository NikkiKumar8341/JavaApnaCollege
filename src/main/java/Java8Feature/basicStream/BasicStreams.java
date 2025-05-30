package Java8Feature.basicStream;

import java.util.*;

public class BasicStreams {

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
    }
}

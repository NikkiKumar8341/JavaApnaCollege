package Java8Feature.basicStream;

import java.util.Comparator;

public class PersonNameComapator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}


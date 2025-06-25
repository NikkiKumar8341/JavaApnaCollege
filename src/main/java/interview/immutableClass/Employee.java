package interview.immutableClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public final class Employee {

    private final String name;

    private final Date doj;

    private final List<String> mobile;


    public Employee(String name, Date doj, List<String> mobile) {
        this.name = name;
        // Defensive copy of mutable object
        this.doj = new Date(doj.getTime());

        // Defensive copy of list
        this.mobile = new ArrayList<>(mobile);
    }

    public String getName() {
        return name;
    }

    public Date getDoj() {
        return new Date(doj.getTime()); // Return a copy
    }

    public List<String> getMobile() {
        return new ArrayList<>(mobile); // Return a copy
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", doj=" + doj +
                ", mobile=" + mobile +
                '}';
    }


    public static void main(String[] args) {
        Date date = new Date();
        List<String> numbers = new ArrayList<>();
        numbers.add("1234");
        numbers.add("464");

        Employee employee = new Employee("Nikhil", date, numbers);

        // Try to modify original date and list
        date.setTime(0);
        numbers.add("0000");

        // Try to modify via getters
        employee.getDoj().setTime(0);
        employee.getMobile().add("9999");

        System.out.println(employee); // Still safe and unchanged

    }
}

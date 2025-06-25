package interview.collectionProblems;

import java.util.*;
import java.util.stream.Collectors;

public class MainCollection {


    public static void main(String[] args) {
//        Student s1=new Student(101,"nikhil","abc@gmail.com");
//        Student s2=new Student(102,"akhil","akhil@gmail.com");
//
//        Student s3=new Student(101,"nikhil","abc@gmail.com");


//        Set<Student> myStudent=new HashSet<>();
//
//        myStudent.add(s1);
//        myStudent.add(s2);
//        myStudent.add(s3);

        //if we not override equals and hashcode method in Student we will print duplicate student only
//        System.out.println(myStudent);

        List<Student> students = new ArrayList<>();

        students.add(new Student(101, "Nikhil", "abc@gmail.com", 22));
        students.add(new Student(102, "Akhil", "akhil@gmail.com", 23));
        students.add(new Student(103, "Sneha", "sneha@gmail.com", 21));
        students.add(new Student(104, "Raj", "raj@gmail.com", 24));
        students.add(new Student(105, "Priya", "priya@gmail.com", 22));
        students.add(new Student(106, "Arjun", "arjun@gmail.com", 25));
        students.add(new Student(107, "Megha", "megha@gmail.com", 20));
        students.add(new Student(103, "Vikas", "vikas@gmail.com", 23));
        students.add(new Student(102, "Riya", "riya@gmail.com", 21));
        students.add(new Student(101, "Nikhil", "abc@gmail.com", 22)); // duplicate

        System.out.println("Student List (with duplicates allowed):");

        Collections.sort(students);

        students.sort(Comparator.comparing(Student::getName));

        for (Student s : students) {
            System.out.println(s);
        }

        List<Student> sortedByAge= students.stream()
                .sorted(Comparator.comparingInt(Student::getAge)
                        .thenComparing(Student::getName))
                .collect(Collectors.toList());

        System.out.println(sortedByAge);

    }
}

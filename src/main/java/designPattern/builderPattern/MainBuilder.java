package designPattern.builderPattern;

public class MainBuilder {
    // Engineering Student

    public static void main(String[] args) {
        Student engineeringStudent = new EngineeringStudentBuilder()
                .setName("Nikhil")
                .setAge(22)
                .setBranch("Engineering")
                .setSpecialization("Computer Science")
                .setEngineeringField("AI/ML") // optional extra field
                .build();

        System.out.println(engineeringStudent);

        // MBA Student
        Student mbaStudent = new MBAStudentBuilder()
                .setName("Akhil")
                .setAge(24)
                .setBranch("MBA")
                .setSpecialization("Finance")
                .setMBASpecialization("Marketing + Analytics") // optional extra field
                .build();

        System.out.println(mbaStudent);
    }

}

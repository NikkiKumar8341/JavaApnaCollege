package designPattern.builderPattern;

public class Student {
    private final String name;
    private final int age;
    private final String branch;
    private final String specialization;

    private Student(StudentBuilder<?> builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.branch = builder.branch;
        this.specialization = builder.specialization;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", branch='" + branch + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }

    // Base builder
    public static abstract class StudentBuilder<T extends StudentBuilder<T>> {
        private String name;
        private int age;
        private String branch;
        private String specialization;

        public T setName(String name) {
            this.name = name;
            return self();
        }

        public T setAge(int age) {
            this.age = age;
            return self();
        }

        public T setBranch(String branch) {
            this.branch = branch;
            return self();
        }

        public T setSpecialization(String specialization) {
            this.specialization = specialization;
            return self();
        }

        protected abstract T self();

        public Student build() {
            return new Student(this);
        }
    }
}


package designPattern.builderPattern;

public class EngineeringStudentBuilder extends Student.StudentBuilder<EngineeringStudentBuilder> {

    private String engineeringField; // specific field if needed

    public EngineeringStudentBuilder setEngineeringField(String field) {
        this.engineeringField = field;
        return this;
    }

    @Override
    protected EngineeringStudentBuilder self() {
        return this;
    }
}

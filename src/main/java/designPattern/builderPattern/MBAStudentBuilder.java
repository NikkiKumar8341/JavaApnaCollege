package designPattern.builderPattern;


public class MBAStudentBuilder extends Student.StudentBuilder<MBAStudentBuilder> {

    private String mbaSpecialization;

    public MBAStudentBuilder setMBASpecialization(String specialization) {
        this.mbaSpecialization = specialization;
        return this;
    }

    @Override
    protected MBAStudentBuilder self() {
        return this;
    }
}

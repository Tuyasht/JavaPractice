package day39.StudentTask;

public class GraduateStudent extends Student{
    public GraduateStudent(String name, int age, char gender, int studentID, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentID, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        System.out.println(getName()+" was studied for "+getFieldOfStudy());
    }
}

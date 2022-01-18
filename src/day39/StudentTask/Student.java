package day39.StudentTask;

public class Student extends Person {
    private int studentID;
    private String fieldOfStudy;
    private char grade;
    private String schoolName;



    public Student(String name, int age, char gender, int studentID, String fieldOfStudy,  char grade,String schoolName) {
        super(name, age, gender);
        this.studentID = studentID;
        this.fieldOfStudy = fieldOfStudy;
        this.schoolName = schoolName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy==null){
            System.err.println("invalid entry");
            System.exit(1);
        }
        if(fieldOfStudy.isEmpty()||fieldOfStudy.isBlank()){
            System.err.println("Can not be empty");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }


    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if (schoolName==null){
            System.err.println("invalid entry");
            System.exit(1);
        }
        if(schoolName.isEmpty()||schoolName.isBlank()){
            System.err.println("Can not be empty");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (!(grade=='A'|| grade=='B' || grade=='C' || grade=='D'|| grade=='F')){
            System.err.println("Invalid grade"+grade);
            System.exit(1);
        }
        this.grade = grade;
    }

    public void study(){
        System.out.println(getName()+" is studying");
    }

    @Override
    public String toString() {
        return "Student{" +
                ", name=" + getName() +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentID=" + studentID +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}

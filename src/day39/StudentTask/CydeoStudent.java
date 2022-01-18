package day39.StudentTask;

public class CydeoStudent extends Student{

     private int batchNumber,groupNumber;
     private String programmingLanguage;

    public CydeoStudent(String name, int age, char gender, int studentID, String fieldOfStudy,  char grade, String schoolName, int batchNumber, int groupNumber, String programmingLangauge) {
        super(name, age, gender, studentID, fieldOfStudy, grade, schoolName);
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.programmingLanguage = programmingLanguage;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber <= 0){
            System.err.println("Invalid number");
            System.exit(1);
        }

        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if (groupNumber <= 0){
            System.err.println("Invalid number");
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage == null ){
            System.err.println("Invalid language");
            System.exit(1);
        }
        if (programmingLanguage.isEmpty()|| programmingLanguage.isBlank())
            System.err.println("Can not be empty");
        System.exit(1);

        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void eat(String programmingLanguage ) {
        System.out.println(getName()+" is eating "+programmingLanguage);
    }

    @Override
    public void drink(String programmingLanguage) {

        System.out.println(getName()+" is drinking "+programmingLanguage);
    }

    @Override
    public void sleep(String programmingLanguage) {

        System.out.println(getName()+" is sleeping "+programmingLanguage);
    }

    @Override
    public String toString() {
        return "Student{" +
                ", name=" + getName() +
                ", age=" + getAge() +
                ", gender=" +getGender() +
                ", studentID=" + getStudentID() +
                ", fieldOfStudy='" + getFieldOfStudy() + '\'' +
                ", grade=" + getGrade()+
                ", schoolName='" + getSchoolName() + '\'' +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}

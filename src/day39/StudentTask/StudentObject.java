package day39.StudentTask;

public class StudentObject {
    public static void main(String[] args) {

        CydeoStudent cydeoStudent = new CydeoStudent("Tuya",47,'F',11,"SDET",'A',"Cydeo",25,22,"Java");
        cydeoStudent.drink("Java");
        cydeoStudent.eat("Java");
        cydeoStudent.sleep("Java");
        System.out.println(cydeoStudent);

        System.out.println("============================================================================================");

        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Olga",36,'F',12,"SDET",'A',"Tech");
        undergraduateStudent.study();
        undergraduateStudent.drink("coke");
        undergraduateStudent.eat("burger");
        undergraduateStudent.sleep("bed");
        System.out.println(undergraduateStudent);
        System.out.println("=========================================================");


        GraduateStudent graduateStudent = new GraduateStudent("Alex",28,'M',13,"math",'B',"Yale");
        graduateStudent.study();
        graduateStudent.drink("water");
        graduateStudent.eat("cookie");
        graduateStudent.sleep("coach");
        System.out.println(graduateStudent);

    }
}

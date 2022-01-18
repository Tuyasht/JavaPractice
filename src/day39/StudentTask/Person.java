package day39.StudentTask;

public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null){
            System.err.println(" Invalid name"+name);
            System.exit(1);
        }
        if (name.isBlank()||name.isEmpty()){
            System.out.println("Name can not be empty");
            System.exit(1);
        }
        for (int i = 0; i <name.length(); i++) {
            char ch = name.charAt(i);
            if ((Character.isLetterOrDigit(ch))){
                System.err.println("Name must be letter");
                System.exit(1);
            }

        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <16){
            System.err.println("Invalid age");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if ((gender=='M'||gender=='F')){
            System.err.println("Invalid entry");
            System.exit(1);
        }
        this.gender = gender;
    }

        public void eat(String food){
            System.out.println(name+" is eating a"+food);
        }
        public void drink(String drink){
            System.out.println(name+" is drinking "+drink);
        }
        public void sleep(String place){
            System.out.println(name+" is sleeping "+place);
        }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
  Student Task:
	1. Create a class named Person:
			Variables:
				name, age, gender

			Encapsulate all the fields

			Add a constructor that can set all the fields

					Condition:
						1. name should not be set to null
						2. name should not be empty
						3. name should not contain any special character other than space
						4. age should not be set to negative
						5. gender must be valid

			Methods:
				eat()
				drink()
				sleep()
				toString()


	2. Create a subclass of Person named Student:
				Extra variables:
						studentId, fieldOfStudy, grade, schoolName

				Encapsulate all the fields

				Add a constructor that can set all the fields

							Condition:
									1. filedOfStudy and schoolName should not be set to null
									2. filedOfStudy and schoolName should not be empty
									3. grade must be valid (A, B, C, D, F)


				Extra methods:
					study()
					toString(): name, age, gender, studentId, fieldOfStudy, grade, schoolName should be included



	3. Create the following sub classes of Student class:

				1. Student Task:
	1. Create a class named Person:
			Variables:
				name, age, gender

			Encapsulate all the fields

			Add a constructor that can set all the fields

					Condition:
						1. name should not be set to null
						2. name should not be empty
						3. name should not contain any special character other than space
						4. age should not be set to negative
						5. gender must be valid

			Methods:
				eat()
				drink()
				sleep()
				toString()


	2. Create a subclass of Person named Student:
				Extra variables:
						studentId, fieldOfStudy, grade, schoolName

				Encapsulate all the fields

				Add a constructor that can set all the fields

							Condition:
									1. filedOfStudy and schoolName should not be set to null
									2. filedOfStudy and schoolName should not be empty
									3. grade must be valid (A, B, C, D, F)


				Extra methods:
					study()
					toString(): name, age, gender, studentId, fieldOfStudy, grade, schoolName should be included



	3. Create the following sub classes of Student class:

				1. GraduateStudent:

						Override the study method

						add any additional fields and methods if necessary

				2. UndergraduateStudent

						Override the study method

						add any additional fields and methods if necessary

				3. CydeoStudent:

						Extra Variables:
							batchNumber, groupNumber, programmingLanguage

						Encapsulate all the fields

						Add a constructor that can set all the fields



						Override the study method

						add any additional fields and methods if necessary

				2. UndergraduateStudent

						Override the study method

						add any additional fields and methods if necessary

				3. CydeoStudent:

						Extra Variables:
							batchNumber, groupNumber, programmingLanguage

						Encapsulate all the fields

						Add a constructor that can set all the fields



 */
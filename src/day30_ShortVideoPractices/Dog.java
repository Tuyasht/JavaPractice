package day30_ShortVideoPractices;

public class Dog {
    public String name;
    public String breed;
    public char gender;
    public String size;    // 6 instance variables
    public int age;
    public String color;

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void drink(){
        System.out.println(name+" is drinking");   // 3 instance methods
    }
    public void play(){
        System.out.println(name+" is playing");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}

package day38.AnimalTask;

public class Cat extends Animal{

    public Cat(String breed, int age, char gender, String size, String color) {
        super("Cat", breed, age, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println(name+" eats cat food");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

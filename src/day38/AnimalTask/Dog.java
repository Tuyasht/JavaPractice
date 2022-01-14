package day38.AnimalTask;

public class Dog extends Animal{
    public Dog(String breed, int age, char gender, String size, String color) {
        super("Dog", breed, age, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println(name+ " eats dog food");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

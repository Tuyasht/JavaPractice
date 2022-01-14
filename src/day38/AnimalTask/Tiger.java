package day38.AnimalTask;

public class Tiger extends Animal{
    public Tiger(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    } // name is Banhar

    @Override
    public void eat() {
        System.out.println(name+" eats tiger food ");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

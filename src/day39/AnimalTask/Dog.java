package day39.AnimalTask;

public class Dog extends FriendlyAnimal{

    public Dog(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    public void eat() {
        System.out.println( getName()+" "+getBreed() + " is eating" );
    }
    public void bark(){
        System.out.println( getBreed()+ " is barking" );
    }
}

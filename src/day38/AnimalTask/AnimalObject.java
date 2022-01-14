package day38.AnimalTask;

public class AnimalObject {
    public static void main(String[] args) {

        Cat cat = new Cat("British",5,'F',"medium","yellow");
        cat.eat();
        System.out.println(cat);

        Dog dog = new Dog("Bulldog",7,'M',"large","black");
        dog.eat();
        System.out.println(dog);

        Tiger tiger = new Tiger("Banhar","Asian",10,'M',"large","brown");
        tiger.eat();
        System.out.println(tiger);

        Eagle eagle = new Eagle("Golden",3,'F',"Small","Golden Brown");
        eagle.eat();
        System.out.println(eagle);
    }
}

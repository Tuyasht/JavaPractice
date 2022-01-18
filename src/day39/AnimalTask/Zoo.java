package day39.AnimalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog("Jack","Husky",'M',5,"Large","White",false,true,true);
        dog.eat();
        dog.bark();
        dog.sleep();
        dog.play();
        dog.pet();
        dog.drink();
        dog.move();
        System.out.println(dog);
        System.out.println("======================================================================");

        Cat cat = new Cat("Lucy","Persian",'F',4,"Small","Orange",false,true,true);
        cat.eat();
        cat.move();
        cat.meow();
        cat.scratch();
        cat.play();
        cat.pet();
        cat.drink();
        cat.sleep();
        System.out.println(cat);
        System.out.println("========================================================================");

        Dolphin dolphin = new Dolphin("Tom","Striped",'M',6,"large","Blue",true,true,true);
        dolphin.eat();
        dolphin.sleep();
        dolphin.move();
        dolphin.drink();
        dolphin.play();
        System.out.println(dolphin);

        System.out.println("===================================");

        Parrot parrot = new Parrot("Karen","Cockatiel",'F',2,"Small","Green",true,true,false);
        parrot.eat();
        parrot.drink();
        parrot.sleep();
        parrot.move();
        parrot.fly();
        parrot.sing();
        System.out.println(parrot);

        System.out.println("==========================================");

        Lion lion = new Lion("Simba","African",'M',3,"Large","Yellow",true,false,false);
        lion.hunt();
        lion.eat();
        lion.drink();
        lion.sleep();
        lion.move();
        System.out.println(lion);
        System.out.println("=====================================================");


        Tiger tiger = new Tiger("Laim", "Asian",'M',8,"Large","Brown",true,false,false);
        tiger.hunt();
        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();
        System.out.println(tiger);

        System.out.println("=======================================================");

        Bear bear = new Bear("Baavgai", "Mongolia",'M',10,"Large","Black",true,false,false);
        bear.hunt();
        bear.eat();
        bear.drink();
        bear.sleep();
        bear.move();
        System.out.println(bear);

        System.out.println("=====================================================================");

        Python python = new Python("Python","Python",'F',2,"Small","Yellow",true,false,false);
        python.hunt();
        python.eat();
        python.drink();
        python.sleep();
        python.move();
        System.out.println(python);

        System.out.println("=============================================================");

        Crocodile crocodile = new Crocodile("Bold","American",'M',6,"Large","Grey",true,false,false);
        crocodile.hunt();
        crocodile.eat();
        crocodile.drink();
        crocodile.sleep();
        crocodile.move();
        System.out.println(crocodile);

    }
}

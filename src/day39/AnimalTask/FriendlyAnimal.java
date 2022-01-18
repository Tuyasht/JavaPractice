package day39.AnimalTask;

public class FriendlyAnimal extends Animal{

    public  boolean isWild;
    public  boolean isFriendly;
    public  boolean isPlayable;

    public FriendlyAnimal(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color);
        this.isWild = isWild;
        this.isFriendly = isFriendly;
        this.isPlayable = isPlayable;
    }

    public void play(){
        System.out.println(getName()+" is playing");
    }
    public void pet(){
        System.out.println(getName()+" is pet");
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" +getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", size='" + getSize() + '\'' +
                ", color='" +getColor() + '\'' +
                ",is friendly='" +isFriendly + '\'' +
                ", is playable='" +isPlayable + '\'' +
                ", is wild ='" +isWild + '\'' +

                '}';
    }
}
/*
     2. Create a subclass of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()
 */
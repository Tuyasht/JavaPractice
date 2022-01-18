package day39.AnimalTask;

public class WildAnimals extends Animal {

    public  boolean isWild;
    public boolean isFriendly;
    public  boolean isPlayable;

    public WildAnimals(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color);
        this.isWild = isWild;
        this.isFriendly = isFriendly;
        this.isPlayable = isPlayable;
    }

    public void hunt(){
        System.out.println(getName()+" is hunting");
    }



    @Override
    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ",is friendly='" + isFriendly + '\'' +
                ", is playable='" + isPlayable + '\'' +
                ", is wild ='" + isWild + '\'' +

                '}';

    }

}

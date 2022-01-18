package day39.DeviceTask;

public class PersonalComputer extends Computer{
    public PersonalComputer(String brand, String model, boolean hasBattery, boolean hasPowerButton, double price) {
        super(brand, model, hasBattery, hasPowerButton, price);
    }

    public void functional(){
        System.out.println(getBrand()+" is functional");
    }


}

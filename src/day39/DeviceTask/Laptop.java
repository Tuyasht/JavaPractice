package day39.DeviceTask;

public class Laptop extends Computer{
    public Laptop(String brand, String model, boolean hasBattery, boolean hasPowerButton, double price) {
        super(brand, model, hasBattery, hasPowerButton, price);
    }

    public void convenient(){
        System.out.println(getBrand()+ " "+ getModel()+ " is convenient");
    }
}

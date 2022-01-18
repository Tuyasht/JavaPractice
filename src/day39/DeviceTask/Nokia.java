package day39.DeviceTask;

public class Nokia extends Phone{
    public Nokia(String brand, String model, boolean hasBattery, boolean hasPowerButton, double price) {
        super(brand, model, hasBattery, hasPowerButton, price);
    }
    public void selfDefense(){
        System.out.println(getBrand()+ " is helping self defence from someone");
    }
}

package day39.DeviceTask;

public class Samsung extends Phone{
    public Samsung(String brand, String model, boolean hasBattery, boolean hasPowerButton, double price) {
        super(brand, model, hasBattery, hasPowerButton, price);
    }

    public void freeze(){
        System.out.println(getBrand() + " is freezing");
    }
}

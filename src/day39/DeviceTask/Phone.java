package day39.DeviceTask;

public class Phone extends Device {

    public Phone(String brand, String model, boolean hasBattery, boolean hasPowerButton, double price) {
        super(brand, model, hasBattery, hasPowerButton, price);
    }

    public void call(){
        System.out.println(getBrand() + " "+ getModel()+ " is calling");
    }
    public void text(){
        System.out.println(getModel()+" is texting");
    }
}

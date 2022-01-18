package day39.DeviceTask;

public class Google extends Phone{
    public Google(String brand, String model, boolean hasBattery, boolean hasPowerButton, double price) {
        super(brand, model, hasBattery, hasPowerButton, price);
    }

    public void gmail(){
        System.out.println(getBrand()+ " is only use gmail");
    }

}

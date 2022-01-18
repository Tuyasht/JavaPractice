package day39.DeviceTask;

public class BlackBerry extends Phone{
    public BlackBerry(String brand, String model, boolean hasBattery, boolean hasPowerButton, double price) {
        super(brand, model, hasBattery, hasPowerButton, price);
    }

    public void soundProtect(){
        System.out.println(getBrand()+"'s sound protect is good");
    }
}

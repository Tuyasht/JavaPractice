package day39.DeviceTask;

public class Desktop extends Computer{
    public Desktop(String brand, String model, boolean hasBattery, boolean hasPowerButton, double price) {
        super(brand, model, hasBattery, hasPowerButton, price);
    }


    public void AllInOne(){
        System.out.println(getBrand()+" has All-in-one");
    }
}

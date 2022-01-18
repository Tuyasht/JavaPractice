package day39.DeviceTask;

public class TV extends Device{
    public TV(String brand, String model, boolean hasBattery, boolean hasPowerButton, double price) {
        super(brand, model, hasBattery, hasPowerButton, price);
    }

    public void channelUp(){
        System.out.println(getBrand()+" channel up");
    }
    public void channelDown(){
        System.out.println(getBrand()+ " channel down");
    }
}
/*
  4. Create a subclass of Device named TV:

				Extra Methods:
					channelUp()
					channelDown()

 */
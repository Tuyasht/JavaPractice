package day39.DeviceTask;

public class Computer extends Device {


    public Computer(String brand, String model, boolean hasBattery, boolean hasPowerButton, double price) {
        super(brand, model, hasBattery, hasPowerButton, price);
    }
public void divideTheScreen(){
    System.out.println(getBrand()+ " is divide the screen");
}

}
/*
  3. Create a subclass of Device named Computer:

				Add the extra methods if needed

 */
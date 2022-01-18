package day39.DeviceTask;

public class Iphone extends Phone{
    public Iphone(String brand, String model, boolean hasBattery, boolean hasPowerButton, double price) {
        super(brand, model, hasBattery, hasPowerButton, price);
    }

    public void faceTime(long phoneNumber){
        System.out.println(phoneNumber+ " is face timing to "+ getModel());
    }
    public void faceTime(String email){
        System.out.println(email+ " is face timing to this "+getBrand());
    }

}
/*


 */

package day39.DeviceTask;

public class Device {
    private String brand,model;
    private boolean hasBattery, hasPowerButton;
    private double price;

    public Device(String brand, String model, boolean hasBattery, boolean hasPowerButton, double price) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
        setHasBattery(hasBattery);
       setHasPowerButton(hasPowerButton);
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        if (price<= 0){
            System.err.println("Invalid price "+price);
            System.exit(1);
        }
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand==null){
            System.err.println("Invalid brand name"+ brand);
            System.exit(1);
        }
        if(brand.isEmpty() || brand.isBlank()){
            System.err.println("Brand name can not be empty");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model==null) {
            System.err.println("Invalid brand name" + model);
            System.exit(1);
        }
            if(brand.isEmpty() || brand.isBlank()){
                System.err.println("Model name can not be empty");
                System.exit(1);
            }
        this.model = model;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public void turnOn(){
        System.out.println(brand + " turn on");
    }
    public void turnOff(){
        System.out.println(brand + " turned off");
    }

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", has battery=" + hasBattery +
                ", has power button=" + hasPowerButton +
                ", price=" + price +
                '}';
    }
}
/*
    Device Task:
	1. Create a class named Device:
			Variables:
					brand, model, price, hasBattery, hasPowerButton

			Encapsulate all the fields

			Add a constructor to set all the fields

						Condition:
							1. brand, model can not be null (if obj == null means it's error)
							2. brand, model can not be empty or can not be blank
							3. price can not be set to negative or zero

			Methods:
				turnOn(), turnOff(), toString()


	2. Create a subclass of Device named Phone:

				Extra Methods:
						call(long phoneNum), text(long phoneNum)

	3. Create a subclass of Device named Computer:

				Add the extra methods if needed

	4. Create a sub class of Device named TV:

				Extra Methods:
					channelUp()
					channelDown()

	public void faceTime(long phoneNumber){
        System.out.println(phoneNumber+ " is face timing to "+ color+ " color  of "+ model);
    }
    public void faceTime(String email){
        System.out.println(email+ " is face timing to this "+ brand );
    }


	5. Create the following sub classes of Computer and add any extra methods that are needed:
				1. PersonalComputer
				1. Desktop
				2. Laptop


	6. Create a class named MyDevices:
			Create the objects of each sub classes and

			test all the functions of each objects

            Analyze the relationships between the classes



 */
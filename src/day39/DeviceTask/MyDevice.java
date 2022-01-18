package day39.DeviceTask;

public class MyDevice {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone","13 pro",true,true,1100);
        iphone.faceTime("tuyasht.com");
        iphone.faceTime(571-2358996);
        iphone.turnOn();
        iphone.turnOff();
        iphone.text();
        iphone.call();
        System.out.println(iphone);
        System.out.println("==================================================");

        Samsung samsung = new Samsung("Samsung","Z Flip3",true,true,1200);
        samsung.freeze();
        samsung.turnOff();
        samsung.turnOn();
        samsung.call();
        samsung.text();
        System.out.println(samsung);
        System.out.println("=====================================================");

        Nokia nokia = new Nokia("Nokia","3310",true,true,600);
        nokia.selfDefense();
        nokia.turnOff();
        nokia.turnOn();
        nokia.text();
        nokia.call();
        System.out.println(nokia);
        System.out.println("==============================================================");

        BlackBerry blackBerry = new BlackBerry("Blackberry","xl200",true,true,500);
        blackBerry.soundProtect();
        blackBerry.text();
        blackBerry.call();
        blackBerry.turnOff();
        blackBerry.turnOn();
        System.out.println("blackberry");
        System.out.println("=====================================================================");

        Google google = new Google("Google","Pixel6",true,true,300);
        google.gmail();
        google.text();
        google.call();
        google.turnOff();
        google.turnOn();
        System.out.println("google");
        System.out.println("=======================================================================");

        Desktop desktop = new Desktop("ASUS","AIO",true,true,900);
        desktop.AllInOne();
        desktop.turnOff();
        desktop.turnOn();
        System.out.println("desktop");

        System.out.println("========================================================");

        PersonalComputer personalComputer = new PersonalComputer("Dell","Optiplex 9020",true,true,1500);
        personalComputer.functional();
        personalComputer.turnOff();
        personalComputer.turnOn();
        System.out.println("personalComputer");
        System.out.println("=================================================================");

        Laptop laptop = new Laptop("Apple","Airbook",true,true,1600);
        laptop.convenient();
        laptop.turnOff();
        laptop.turnOn();
        System.out.println("laptop");
        System.out.println("===========================================================");

        TV tv = new TV("LG","OLED",false,true,2500);
        tv.channelDown();
        tv.channelUp();
        tv.turnOff();
        tv.turnOn();
        System.out.println(tv);
    }
}

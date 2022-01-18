package day30_ShortVideoPractices;

public class AccessModifiers {

    private static int n1 = 100;
    static int n2 = 200;       // default
    public static int n3 = 300;


    private static void method1(){
        System.out.println("method with private access modifier");
        // not visible except it's own class
    }
    static void methods(){
        System.out.println("method with default access modifier");
        // visible in class & package
    }
    public static void method3(){
        System.out.println("method with public access modifier");
        // visible for class, package, Subclass, world
    }

}

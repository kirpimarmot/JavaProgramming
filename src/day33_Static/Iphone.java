package day33_Static;

public class Iphone {
    public static String brand = "Apple";
    public String model;
    public double price;
    public static String operatingSystem = "IOS";
    public String color;
    public String size;
    public static String madeIN= "China";
    public static boolean hasBattery=true;
    public static boolean isTouchScreen= true;
    public static boolean hasFaceTime = true;

    public static void printOperatingSystem(){
        System.out.println(operatingSystem);
    }

    //public static void printModelAndPrice(){
       // System.out.println(model+" : "+price);//static methods in java do not accept instances
    //}


}

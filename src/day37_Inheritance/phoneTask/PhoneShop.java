package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {
        Iphone iphone = new Iphone("Iphone 12", "6.7 inches", 1000, "Black");
        Samsung samsung = new Samsung("galaxy S19", "6 inches", 900, "White");
        Nokia nokia =new Nokia("Brick", "4 inches", 50, "Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(1223455667);
        iphone.faceTime(231456654);
        iphone.faceTime("yahoo@hotmail.com");

        System.out.println("-----------------------------------");

        samsung.call(911);
        samsung.text(283746533);
        samsung.freeze();

        System.out.println("------------------------------------");
        nokia.call(911);
        nokia.text(987463534);
        nokia.selfDefense();

        System.out.println("--------------------------------------");

        System.out.println(Phone.hasBattery);
        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);

        }

}





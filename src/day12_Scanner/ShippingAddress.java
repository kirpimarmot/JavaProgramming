package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Full Name");
        String fullName = input.nextLine();

        System.out.println("Enter your Building Number");
        int buildingNumber = input.nextInt();
        input.nextLine();

        System.out.println("Enter your Street Name");
        String streetName = input.nextLine();

        System.out.println("Enter your City Name");
        String cityName = input.nextLine();

        System.out.println("Enter your State Name");
        String stateName = input.nextLine();

        System.out.println("Enter your Zipcode");
        int zipcode = input.nextInt();
        input.nextLine();

        System.out.println("Enter your Country Name");
        String countryName = input.next();

        System.out.println("Shipping address: "+fullName+ ": " +buildingNumber+" "+streetName+" "+cityName+" "+
                stateName+" "+zipcode+" "+countryName);
    }
}

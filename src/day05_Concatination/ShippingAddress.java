package day05_Concatination;
/*
Declare the following variables:
    name
    buildingNumber
    streetName
    city
    state
    zipCode
Use concatenation to print the full shipping address
    EX:
		Jimmy Joe
		7925 Jones Branch Dr
		McLean, VA 20125*/
public class ShippingAddress {

    public static void main(String[] args) {

        String name = "Jimmy Joe";
        int buildingNumber = 7925;
        String streetName = "Jones Branch Dr";
        String city = "McLean";
        String state = "VA";
        int zipcode = 20125;

        System.out.println(name + "\n"+ buildingNumber + " " + streetName +"\n"+ city + ", " + state + " "+ zipcode);

        String address = name + "\n"+ buildingNumber + " " + streetName +"\n"+ city + ", " + state + " "+ zipcode;

        System.out.println( address);

        
    }
}

package LiveReviewWeek02;

public class carInfo {
    public static void main(String[] args) {
        int year = 2022;
        String made = "Audi";
        String model = "A6";
        //automatic = true; manuel = false;
        boolean transmission = true;
        String colour = "black";
        int milage = 0;
        int price = 100_000; // for Europe
        System.out.println(year+" "+made+" "+model+"\nAutomatic Transmission : "+transmission);

        //let's turn this value into TL 1 Euro = 15.5 TL

        double priceInTl = price * 15.5;
        double taxRate = 1.80; // for this kind of cars
        double priceAfterTaxInTl = priceInTl+(priceInTl*taxRate);

        System.out.println("priceAfterTaxInTl = " + priceAfterTaxInTl);




    }
}

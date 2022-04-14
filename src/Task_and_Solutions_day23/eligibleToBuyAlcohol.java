package Task_and_Solutions_day23;

public class eligibleToBuyAlcohol {
    public static void main(String[] args) {
      eligibleToBuyAlcohol(17);
    }
    public static void eligibleToBuyAlcohol(int age){
        if (age >= 18){
            System.out.println("Person is eligible to buy alcohol");
        }else{
            System.out.println("Person is not eligible to buy alcohol");
        }
    }



}

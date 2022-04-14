package Task_and_Solutions_day23;

public class IntegerType {
    public static void main(String[] args) {
positiveNegativeOrZero(-199002);
    }
    public static void positiveNegativeOrZero(int number){
       String intType = (number<0)? "Negative" :(number>0)? "Positive" : "Zero";
        System.out.println(intType);
    }





}

package Task_and_Solutions_day23;

public class DollarToEuro {
    public static void main(String[] args) {
       dollarConverter(100);
    }
    public static void dollarConverter(int amount){
        double euro = amount*1.13;
        System.out.println("$"+amount+" equal to "+"Euro"+euro);
    }





}

package Task_and_Solutions_day23;

public class nameFormating {

    public static void main(String[] args) {
       fullName("kursat", "cevik");
    }
    public static void  fullName(String firstName, String secondName){
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        secondName =secondName.substring(0,1).toUpperCase() +secondName.substring(1).toLowerCase();
        String fulName = firstName+" "+secondName;
        System.out.println("fulName = " + fulName);
    }






}

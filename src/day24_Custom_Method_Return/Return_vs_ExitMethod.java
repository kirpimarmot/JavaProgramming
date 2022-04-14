package day24_Custom_Method_Return;

public class Return_vs_ExitMethod {
    public static void main(String[] args) {
    nameOfMonth(50);

        System.out.println("Hello World");

    }
    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number) {

        if (number < 1 || number > 12) {
            System.out.println("Invalid");
            //return;// exits nameOFMonth method- you can use this method just exiting not for returning a value
            System.exit(0);
        }
        String name = (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March" : (number == 4) ? "April"
                : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "August "
                : (number == 9) ? "September" : (number == 10) ? "October" : (number == 11) ? "November"
                : "December";

        System.out.println("Month name = " + name);

    }
}
package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        int number = 5;
       /* if (number==1){
            System.out.println("Monday");
        }*/

        switch (number){
            case 1:
                System.out.println("Monday");
                break;//exits the switch after executing the block and it doesn't have to execute the next line
            case 2:
                System.out.println("Tuesday");
                break;//exits the switch after executing the block
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:// only executes if none of the blocks are matching
                System.out.println("Invalid");

        }



    }
}

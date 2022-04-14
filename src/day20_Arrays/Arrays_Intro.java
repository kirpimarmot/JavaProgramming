package day20_Arrays;

import java.util.Arrays;

public class Arrays_Intro {
    public static void main(String[] args) {
        //create a variable that's capable enough to contain 5 names but we don't know them
        String[] myGroup = new String[5];
        myGroup[0]="Gunay";
        myGroup[1]="Neria";
        myGroup[2]="Suat";
        myGroup[3]="Hulya";
        myGroup[4]="Mikael";


        //System.out.println(myGroup); This gives the hashcode error
        System.out.println(Arrays.toString(myGroup));// Gunay, Neria, Suat, Hulya, Mikael

        System.out.println("----------------------------------------");
        String[] dayOfWeek = {"Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(Arrays.toString(dayOfWeek));

        int number =5;
        if (number<1||number>7){
            System.err.println("invalid Number");
            System.exit(0);
        }
        System.out.println(dayOfWeek[number-1]);

        System.out.println("------------------------------------");
        String[] months = {"January","February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        System.out.println(Arrays.toString(months));

        int number1 =5;
        if (number<1||number>12  ){
            System.err.println("invalid Number");
            System.exit(0);
        }
        System.out.println(months[number-1]);






    }
}

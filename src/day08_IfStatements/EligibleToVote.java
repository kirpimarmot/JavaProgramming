package day08_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "Josh";
        int age = 38;
        String citizen = "USA";
        boolean isElligible = age >= 21 && citizen == "USA";// True

        //Eligible
        if(isElligible){ // True
            System.out.println("Eligible" );
        }
        //Not Eligible
        if(!isElligible){ // !True ==> not true ==> false
            System.out.println("Not Eligible");
        }
    }
}

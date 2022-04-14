package Task_and_Solutions_day23;

public class EligibleToVote {
    public static void main(String[] args) {
eligibleToVote(12, "tr");
    }

    public static void eligibleToVote(int age, String citizen){
        if (age>=18 && citizen.equalsIgnoreCase("usa")){
            System.out.println("You are eligible to Vote");
        }else{
            System.out.println("You are not eligible to Vote");
        }
    }



}

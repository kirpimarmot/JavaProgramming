package day09_IfStatemnets;

public class GradeReport {
    public static void main(String[] args) {
        int score = 85;

        String grade;

        if (score >= 90) {
            grade = "Excellent";
        } else if (score >= 80 && score <= 89) {
            grade = "Great";
        } else if (score >= 70 && score <= 79) {
        grade = "Good";
        }else if (score >=60 && score <=69){
            grade = "passed";
        }else{
            grade = "failed";
        }
        System.out.println("Grade= "+ score);


        }
}

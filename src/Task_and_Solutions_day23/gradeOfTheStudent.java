package Task_and_Solutions_day23;

public class gradeOfTheStudent {
    public static void main(String[] args) {
    studentGrades(78);
    }
    public static void studentGrades(int score) {
        String grade = "";
        if (score >= 0 && score <= 100) {
            grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ?
                    "D" : "E";
        }
        System.out.println("Grade = " + grade);


    }
}



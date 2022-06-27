package reviewWeekHonour;

public class day1_TernaryPractice_FindTheBIggestNumeber {
    public static void main(String[] args) {
        int n1=10, n2=20, n3=30;

        String result = (n1>n2 & n1>n3)? "n1 is the biggest" : (n2>n1 & n2>n3)? "n2 is the biggesst" : "n3 is the biggest";

        System.out.println("result = " + result);

    }

}

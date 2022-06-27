package reviewWeekHonour;

public class day1_StringPractice_IsPalindrome {
    public static void main(String[] args) {

        String str ="Anna";
        String result ="";

        for (int i = str.length()-1; i >=0 ; i--) {
            char ch = str.charAt(i);
            result+=ch;
        }
        if (result.equalsIgnoreCase(str)) {
            System.out.println("Anna: is Palindrome");
        }else{
            System.out.println("Anna: is not palindrome");
        }

    }
}

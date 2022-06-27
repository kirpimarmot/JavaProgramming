package reviewWeekHonour;

public class day1_StringPractice_ReverseElements {
    public static void main(String[] args) {
        String str = "Wooden Spoon";
        String reverse = "";

        for (int i = str.length()-1; i >=0; i--) {
            char str1 = str.charAt(i);
            reverse += str1;
        }
        System.out.println("reverse = " + reverse);
    }
}

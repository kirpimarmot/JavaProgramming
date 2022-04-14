package SelfStudy;

public class Reverse {
    public static void main(String[] args) {
        String str = "Wooden Spoon";
        String result = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }

        System.out.println("result = " + result);
    }

}

package Interview_Tasks;

public class String_Parsit {
    public static void main(String[] args) {

        String str = "125";

        boolean b = checkisCharectersAreDigit(str);
        if (b){

            int total=0;
            for (char c : str.toCharArray()) {
                total+=Integer.parseInt(c+"");
            }
            System.out.println(total);

        }
        else{
            System.out.println("AlphaNumeric String is the input");
        }
    }

    private static boolean checkisCharectersAreDigit(String str) {
        boolean flag = true;

        for (char c : str.toCharArray()) {
            if (Character.isAlphabetic(c)){
                flag=false;
                break;
            }
        }

        return flag;
    }
}





/*
For the input - "12345", the output should be = 15
        For the input - "1v2rFG5", thr output should be = "AlphaNumeric String is the input"
 */


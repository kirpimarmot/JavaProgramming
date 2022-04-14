package Task_and_Solutions_day23;

public class eachCharacterOfString {
    public static void main(String[] args) {
      eachChar("Wooden Spoon");
    }
    public static void eachChar(String str){
        for (int i = 0; i <str.length() ; i++) {
            System.out.print(str.charAt(i));
        }
    }





}

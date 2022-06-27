package reviewWeekHonour;

public class day1_StringPractice_RemoveDublicates {
    public static void main(String[] args) {
        String str = "aaabbcccdeeeff";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            String str1= ""+str.charAt(i);

            if (!result.contains(str1)){
                result+=str1;
            }
        }
        System.out.println("result = " + result);
    }
}

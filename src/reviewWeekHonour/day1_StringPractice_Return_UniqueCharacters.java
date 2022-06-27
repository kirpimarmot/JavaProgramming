package reviewWeekHonour;

public class day1_StringPractice_Return_UniqueCharacters {
    public static void main(String[] args) {

        String str = "AABCCD";
        String uniqueCharacters = "";

        for (int i = 0; i < str.length(); i++) {

            String chr = str.charAt(i)+"";

            if (str.indexOf(chr)==str.lastIndexOf(chr)){

                uniqueCharacters+=chr;
            }
        }
        System.out.println("uniqueCharacters = " + uniqueCharacters);


    }
}

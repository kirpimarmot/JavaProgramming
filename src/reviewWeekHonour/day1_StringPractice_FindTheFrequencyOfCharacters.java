package reviewWeekHonour;

public class day1_StringPractice_FindTheFrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aabcccd";
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            String ch = str.charAt(j) + "";

            int frequency = 0;

            for (int i = 0; i < str.length(); i++) {
                String characters = str.charAt(i) + "";
                if (characters.equals(ch)) {
                    frequency++;
                }
            }
            if (!result.contains(ch)) {
                result += ch;
                result += frequency;
            }
        }
        System.out.println("result = " + result);
    }
}
/*
 Write a program that can find the frequency of the characters from a string
			 Ex:
                        str = "aabcccd";
                        output:
                                a2b1c3d1
 */
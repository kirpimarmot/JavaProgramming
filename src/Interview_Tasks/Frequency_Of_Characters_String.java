package Interview_Tasks;



public class Frequency_Of_Characters_String {
    public static void main(String[] args) {

        String str = "aabcccd";
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            String chars = str.charAt(j) + "";

            int frequency = 0;

            for (int i = 0; i < str.length(); i++) {
                String chs = str.charAt(i) + "";
                if (chs.equals(chars)) {
                    frequency++;

                }
            }

            if (!result.contains(chars)) {
                result += chars;
                result += frequency;
            }

        }
        System.out.println(result);
    }
}
/*
 Write a program that can find the frequency of the characters from a string
			 Ex:
                        str = "aabcccd";
                        output:
                                a2b1c3d1
 */
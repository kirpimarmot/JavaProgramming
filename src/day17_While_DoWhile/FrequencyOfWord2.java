package day17_While_DoWhile;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String str = "Cat Cat Cat Cat Dog Dog";
        int frequency = 0;

        for (int i = 0; i < str.length()-2; i++) {
            String eachSubString = str.substring(i,i+3);
            if (eachSubString.equals("Cat")){
                frequency++;

            }
        }

        System.out.println(frequency);

    }
}

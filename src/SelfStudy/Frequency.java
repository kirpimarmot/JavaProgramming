package SelfStudy;

public class Frequency {
    public static void main(String[] args) {

        String str = "Java Java Java Python Python";

        int frequency = 0;

        for (int i = 0; i <str.length()-5 ; i++) {
            String eachSubString = str.substring(i,i+6);
            if (eachSubString.equals("Python")){
                frequency++;
            }
        }

        System.out.println(frequency);
    }
}

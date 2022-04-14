package day20_Arrays;

public class Appeared_Twice {
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'a', 'b', 'c', 'c', 'd', 'd', 'd'};

        for (int j = 0; j < chars.length; j++) {
            char ch = chars[j];
            int frequency = 0;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == ch) {
                    frequency++;
                }
            }
            if (frequency == 2) {
                System.out.println(ch);
            }
        }








    }
}

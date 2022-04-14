package day19_LoopPractices;

public class DublicatedCharecters_AppearsTwice {
    public static void main(String[] args) {
        String str = "aabccdeef";
        String result ="";

        for (int j = 0; j < str.length() ; j++) {

            char ch =str.charAt(j);
            int count = 0;// this represents the frequency of the ch

            for (int i = 0; i <str.length() ; i++) {// it is to get every single character from the str
                char each = str.charAt(i);// each character of str
                if (ch == each){
                    count++;
                }
            }
            /*
            if(count!=1){
                continue;// means skip
            }
            */
            if (count==2){// if the frequency of the character 1, it means it is unique
                result  += ch;

            }
        }

        System.out.println(result );
    }
}

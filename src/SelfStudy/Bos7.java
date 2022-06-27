package SelfStudy;

public class Bos7 {
    public static void main(String[] args) {
        String[] sentence = {"java", "java", "python", "java", "java", "python", "python"};

        int numJava = 0;
        int numPython = 0;
        for (int i = 0; i < sentence.length; i++) {
            if (sentence[i].equals("java")) {
                numJava++;
            } else {
                numPython++;
            }
        }
        System.out.println(numJava);
        System.out.println(numPython);

        countElement(sentence, "python");

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

       String result ="";

        for(int i : arr1){

            for (int i1 : arr2) {
                if (i==i1){
                    result+=i;

                }
            }
        }
        System.out.println(result);

    }

    public static void countElement(String[] sentence, String element){
        int countElement=0;
        for (int i = 0; i < sentence.length; i++) {
            if(sentence[i].equals(element)){
                countElement++;
            }
        }
        System.out.println(countElement);
    }


}
package Tasks_And_Solutions_day24;

public class Frequency_Of_Word {
    public static void main(String[] args) {

        int count = frequencyOfWord("Java java java python python","Java");
        System.out.println("count = " + count);
    }

    public static int frequencyOfWord(String sentence, String word){
        int frequency=0;
        while (sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"");
            frequency++;
        }
        return frequency;
    }



}
/*
1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
                    */


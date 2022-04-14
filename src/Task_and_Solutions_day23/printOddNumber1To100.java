package Task_and_Solutions_day23;

public class printOddNumber1To100 {
    public static void main(String[] args) {
       printOddNumbers1To100(100);
    }
public static void printOddNumbers1To100(int number){
    for (int i = 1; i <101 ; i++) {
        if (i%2!=0){
            System.out.print(i+" ");
        }
    }
}


}

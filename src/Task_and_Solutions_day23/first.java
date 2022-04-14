package Task_and_Solutions_day23;

public class first {
    public static void main(String[] args) {
     printEvenNumbers1To100(100);
    }

    public static void printEvenNumbers1To100(int number){
        for (int i = 1 ; i <101 ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }

        }
    }

}

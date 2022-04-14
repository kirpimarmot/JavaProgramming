package SelfStudy;

public class Return {
    public static void main(String[] args) {
        total(3,5);
         int a = max(3,5);
         int b =  a / 2;
        System.out.println(b);

    }

    public static void total(int num1, int num2){
        int total = num1 + num2;
        System.out.println(total);
    }

    public static int max(int num1, int num2){
        int maxNumber =0;
        if (num1>num2){
            maxNumber = num1;
        }else{
            maxNumber=num2;
        }
        return maxNumber;
    }
}

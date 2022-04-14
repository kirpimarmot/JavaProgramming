package day24_Custom_Method_Return;

public class Return_Statement {
    public static void main(String[] args) {
       nameOfDay(10);
    }

    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){
        if (number<1 || number>7){// if the number is invalid
            System.out.println("Invalid");
            return; //exist nameOfDay method-Return Method is also used to exit the void method
        }

        if (number==1){
            System.out.println("Monday");
        }else if(number==2){
            System.out.println("Tuesday");
        }else if(number==2){
            System.out.println("Wednesday");
        }else if(number==2){
            System.out.println("Thursday");
        }else if(number==2){
            System.out.println("Friday");
        }else if(number==2){
            System.out.println("Saturday");
        }else{
            System.out.println("Sunday");
        }
    }

}

package Task_and_Solutions_day23;

public class Calculator {
    public static void main(String[] args) {
    calculate(1, 2, '+');
    }
    public static void calculate(double num1, double num2, char operator) {
        String result = "Invalid";

        if (operator == '-' || operator == '+' || operator == '*' || operator == '/') {
            result = "Subtraction: " + (num1 - num2);
        } else if(operator=='+'){
            result= "Addition: "+(num1+num2);
        }else if (operator=='*'){
            result= "Multiplication: "+(num1*num2);
        }else{
            result= "Division: "+ (num1/num2);
        }

        System.out.println(result);






    }

}

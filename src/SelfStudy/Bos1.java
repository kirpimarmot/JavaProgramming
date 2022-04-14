package SelfStudy;

public class Bos1 {
    public static void main(String[] args) {
        dayOfWeek(8);
        double area = rectangleArea(6, 8);
        System.out.println(area);
        int perimeter = rectanglePerimeter(5, 7);
        System.out.println(perimeter);
        int result = evenOrOddNumber(89);
        System.out.println(result);

    }

    public static void dayOfWeek(int number) {
        if (number < 1 || number > 7) {
            System.out.println("invalid number");
            return;
        }
        if (number == 1) {
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number == 4) {
            System.out.println("Thursday");
        } else if (number == 5) {
            System.out.println("Friday");
        } else if (number == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }
    }

    public static double rectangleArea(double length, double width) {
        double area = length * width;
        return area;
    }

    public static int rectanglePerimeter(int length, int width) {
        int perimeter = 2 * (length + width);
        return perimeter;
    }

    public static int evenOrOddNumber(int number) {
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        return number;
    }
}

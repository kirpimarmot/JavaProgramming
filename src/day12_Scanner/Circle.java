package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = scan.nextDouble();
        scan.close();
        double PI = 3.14;
        double perimeter = 2 * radius * PI;
        double area = radius * radius * PI;

        System.out.println("Perimeter is = " +perimeter);
        System.out.println("Area is = " +area);

    }
}

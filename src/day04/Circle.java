package day04;

public class  Circle {
    public static void main(String[] args) {
        double PI = 3.14;
        double radius = 35;
        double area = radius * radius * PI;
        double diameter = 2 * radius;
        double perimeter = 2 * radius * PI;


        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }
}

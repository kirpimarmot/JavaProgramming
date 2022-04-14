package day05_Concatination;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Kursat";
        String lastName = "Cevik";
        int age = 38;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        //FullName of the person is ______
        System.out.println("Full name of the person is " + fullName);
        //_____ is ____ years old
        System.out.println(fullName + " is " + age + " years old");
        //FullName is jobTitle +, works at + companyName, and FullName's salar is salary
        System.out.println(fullName + " is " +jobTitle + ", works at "  + companyName
                + ", and "+ fullName+ "'s salary is $" + salary);


    }
}

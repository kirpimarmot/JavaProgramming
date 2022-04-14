package day24_Custom_Method_Return;

public class Breakfast_Tasks {
    public static void main(String[] args) {
    initials("Cydeo", "school");
    System.out.println("----------------------------");
    domain("Cydeo@gmail.com");
    System.out.println("-----------------------------");
    String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com" };
        for (String email : emails) {
            domain(email);
        }
    System.out.println("--------------------------");
        nameOfMonth(7);
    System.out.println("--------------------------");
    nameOfDay(7);
    System.out.println("-----------------------");
    DaysInMonth(7);
    System.out.println("-------------------------");
    ageGroup(43);



    }
    //1. Create a method that can display the initials of the person. initials(String firstName, String lastName)
    public static void initials(String firstName, String lastName){
        String initials =firstName.charAt(0)+"."+lastName.charAt(0);
        initials = initials.toUpperCase();
        System.out.println("initials = " + initials);

    }
    //2. Create a method that can display the domain of the email
    public static void domain(String email){
        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.print("domain = " + domain+", ");
    }
    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number) {
        String name = "";
        if (number >= 1 && number <= 12) {
            name = (number == 1)? "January" :(number == 2)? "February" :(number == 3)? "March" :(number == 4)? "April"
                    :(number == 5)? "May" :(number == 6)? "June" :(number == 7)? "July" :(number == 8)? "August "
                    :(number == 9)? "September" :(number == 10)? "October" :(number == 11)? "November"
                    : "December";
        } else {
            name = "Invalid";
        }
        System.out.println("Month name = " + name);





    }
    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number) {
        String name1 = "";
        if (number >= 1 && number <= 12) {
            name1 = (number == 1) ? "Monday" : (number == 2) ? "Tuesday" : (number == 3) ? "Wednesday"
                    : (number == 4) ? "Thursday" : (number == 5) ? "Friday" : (number == 6) ? "Saturday" : "Sunday";
        } else {
            name1 = "Invalid";
        }
        System.out.println("Day name = " + name1);
    }
    //5. Create a method that can print how many days a month has
    public static void DaysInMonth(int number){
        boolean has28Days = number == 2; // for the month that has 28 days
        boolean has30Days =  number == 4 || number == 6 || number ==9 || number == 11; // for the months that has 30 days
        boolean has31Days = !has28Days && !has30Days; // if the month does not have 28 days and does not have 30 days
        if(has28Days){ //if the month has 28 days
            System.out.println("28 days");
        }
        if(has30Days){ //if the month has 30 days
            System.out.println("30 days");
        }
        if(has31Days){ // if the month has 31 days
            System.out.println("31 days");
        }
    }
    //6.Age groups
    public static void ageGroup(int age){
        if (age>=1&&age<=2){
            System.out.println("Infant");
        }else if (age>=3&&age<=5){
            System.out.println("Toddler");
        }else if (age>=6&&age<=9){
            System.out.println("Kid");
        }else if (age>=10&&age<=12){
            System.out.println("Pre-Teen");
        }else if (age>=13&&age<=17){
            System.out.println("Teenager");
        }else if (age>=18&&age<=20){
            System.out.println("Young Adult");
        }else if (age>=21&&age<=39){
            System.out.println("Adult");
        }else if (age>=40&&age<=49){
            System.out.println("Young Middle-age Adult");
        }else if (age>=50&&age<=54){
            System.out.println("Middle age Adult");
        }else if (age>=55&&age<=64){
            System.out.println("Very Young Senior Citizen");
        }else if (age>=65&&age<=74){
            System.out.println("Young Senior Citizen");
        }else if (age>=75&&age<=84){
            System.out.println("Senior Citizen");
        }else{
            System.out.println("Old Senior Citizen");
        }
    }




}
/*
Warmup tasks:
	1. Create a method that can display the initials of the person
	2. Create a method that can display the domain of the email
	3. Create a method that can display the name of the month based on the given number to the method
	4. Create a method that can print the name of the day based on the given number to the method
	5. Create a method that can print how many days a month has
    6. ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)
                        */
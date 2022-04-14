package day36_Inheritance.employeeTask;

public class TestEmployee {
    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.setInfo("Ahmet", 'M', 29, 33, "Java Developer", 110000, "CYDEO");

        Developer developer = new Developer();
        developer.setInfo("Ayla", 'F', 29, 32,"Java Developer", 100000, "CYDEO" );

        Driver driver = new Driver();
        driver.setInfo("Oscar", 'M', 39, 26, "Truck Driver", 150000, "CYDEO");

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(driver);

    }



}

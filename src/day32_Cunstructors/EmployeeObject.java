package day32_Cunstructors;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Aaron");
        Employee employee2 = new Employee("Ahmet", 'M');
        Employee employee3= new Employee("Sharon", 'F', "SDET");
        System.out.println(employee1);
        System.out.println(employee2);


    }
}

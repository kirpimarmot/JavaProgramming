package day36_Inheritance.employeeTask;

public class Developer extends Employee{

    public void develop(){
        System.out.println(name+" is developing codes");
    }

    public void fixingBugs(){
        System.out.println(name+" is fixing bugs");
    }
}

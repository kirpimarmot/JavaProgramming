package day36_Inheritance.employeeTask;

public class Employee {

    public String name;
    public char gender;
    public int age, ID;
    public String jobTitle;
    public double salary;
    public String companyNAme;

    public void setInfo(String name, char gender, int age, int ID, String jobTitle, double salary, String companyNAme) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.companyNAme = companyNAme;
    }

    public void work(){
        System.out.println(jobTitle+" "+name+" is working");
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary=" + salary +
                ", companyNAme='" + companyNAme + '\'' +
                '}';
    }
}



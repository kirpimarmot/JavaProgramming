package day36_Inheritance.encapsulation;

public class StudentObject {
    public static void main(String[] args) {

        Student student1 = new Student("Kursat", 38, 'M','A', "CYDEO");
        student1.setAge(39);
        System.out.println(student1);
    }
}

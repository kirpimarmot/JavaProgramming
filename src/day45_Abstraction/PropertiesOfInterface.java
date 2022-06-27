package day45_Abstraction;

public interface PropertiesOfInterface {

    int a = 100; //static & final by default
    static int b = 200; //it is also final by default

    /*
    public   PropertiesOFInterface(int a) {
        this.a = a;
    }
     */

    /*
    static {
        b =100;
    }
     */

    /*
    public void method1(){
        System.out.println("Instance Method");
    }
    */

    static void method2(){ //it is also public by default
        System.out.println("Static Method");
    }

    abstract void method3(); //it is also public by default

    default void method4(){ // it is also public by default
        System.out.println("Default Method");
    } // it will be treated as instance method in the child method

}

class Test implements PropertiesOfInterface{

    @Override
    public void method3() {

    }

    public static void main(String[] args) {

        new Test().method4();
    }
}
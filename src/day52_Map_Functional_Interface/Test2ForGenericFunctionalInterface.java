package day52_Map_Functional_Interface;

public class Test2ForGenericFunctionalInterface {

    public static void main(String[] args) {

        MySecondFunctionalInterface<String > printEach = (str) -> {
            for (String each : str.split("")) {
                System.out.println(each);
            }
        };
        printEach.test("Wooden Spoon");

       MySecondFunctionalInterface<Integer> cube = (n) -> {
           System.out.println(n*n*n);
       };

       cube.test(6);







    }
}

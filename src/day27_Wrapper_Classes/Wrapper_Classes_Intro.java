package day27_Wrapper_Classes;

public class Wrapper_Classes_Intro {

    public static void main(String[] args) {
        int num1 = 200;
        Integer n1 = num1;// autoboxing

        int num2 = n1;// unboxing

        System.out.println("---------------------------");

        Integer integerValue = 100;
        long longValue = integerValue;

        Byte b1 = 25;

        byte a1 = b1;
        short a2 = b1;
        int a3 = b1;
        long a4 = b1;

        System.out.println("------------------------------");
        int num3 =200;

        //Byte b2 = num3;
        //Short s1 = num3;
        //Long l2 = num3;
        //Double d1 = num3;
        int a5 = num3;
        /* when we convert any primitives into wrapperclass object
        we have to convert to its type.For instance int==>Integer, long==> Long
        But we convert any wrapperclass object into primitives we are free
        For instance Integer==>long, Long==>short */
        Integer num4 = num3;//Autoboxing

        System.out.println("-----------------------------");
        Integer z = 900;
        Integer y = z;

        System.out.println("-----------------------------");
        int[] numbers1 = {1,2,3,4,5};
        Integer[] numbers2 = {1,2,3,4,5};






    }
}

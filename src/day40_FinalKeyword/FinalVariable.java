package day40_FinalKeyword;

public class FinalVariable {

    final String birthday;
    final static String name;

    static {
        name="EU8";
    }

    public FinalVariable(String birthday) {
        this.birthday = birthday;
    }



    public static void main(String[] args) {

        final double pi = 4.14;

        // pi=4.14;
        // pi=5.14;

        final String name;

        name="java";
        //name= "Wooden Spoon";

        System.out.println(name);

        System.out.println("---------------------------");

        FinalVariable obj = new FinalVariable("May/01");
        //obj.birthday= "June/01";//final variable can not be reassigned

        System.out.println(obj.birthday);

        System.out.println("------------------------------------");

        //FinalVariable.name="Python";
        System.out.println(FinalVariable.name);
    }
}

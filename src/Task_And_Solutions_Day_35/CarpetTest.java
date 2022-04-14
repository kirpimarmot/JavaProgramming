package Task_And_Solutions_Day_35;

public class CarpetTest {
    public static void main(String[] args) {

    Carpet carpet = new Carpet(4, 5,3.5,true);

        System.out.println(carpet);

        carpet.setPersian(true);
        carpet.setUnitPrice(8);
        carpet.setWidth(7);
        carpet.setLength(6);


        System.out.println(carpet);


    }

}

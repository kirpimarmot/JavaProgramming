package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Practice_2 {
    public static void main(String[] args) {
    ArrayList<String> employeess = new ArrayList<>();
    employeess.addAll(Arrays.asList("Ali", "David", "Ahmed", "Jimmy", "Daniel", "Aaron", "Ahmed", "David", "Shay"));

    employeess.retainAll(Arrays.asList("Ahmed", "David"));
        System.out.println(employeess);

        System.out.println("--------------------------------------------------");
        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));//now it is an arraylist
        list.removeIf(p-> p.charAt(0)=='M');
        System.out.println(list);
        names = list.toArray(new String[0]);// now it is an array
        System.out.println(Arrays.toString(names));





    }
}

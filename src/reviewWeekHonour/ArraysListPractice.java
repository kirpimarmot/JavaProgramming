package reviewWeekHonour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysListPractice {
    public static void main(String[] args) {


    String str = "aaabbbcdddfeee";

    String[] arr = str.split("");


    ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

    String result = "";

        for (String each : list) {
            int frequency = Collections.frequency(list, each);
            if (frequency==1){
                result+=each;
            }
        }

        System.out.println(list);
        System.out.println(result);


        System.out.println("-----------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);

        int max = list1.get(0);//arr[0] arrey de ise boyle aliyorduk
        int min = list1.get(0);
        int sum = 0;

        for (Integer each : list1) {
            if (each>max){
                max=each;
            }
            if (each<min){
                min=each;
            }

            sum+=each;

        }
            System.out.print(max);
            System.out.print(min);
            System.out.print(sum);
            System.out.print(sum/list1.size());

        System.out.println("------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(10);
        list2.add(10);
        list2.add(20);
        list2.add(20);
        list2.add(20);
        list2.add(30);
        list2.add(30);
        list2.add(30);

        ArrayList<Integer> result1 = new ArrayList<>();

        for (Integer ech : list2) {
            if (result1.contains(ech)){
                continue;
            }
            result1.add(ech);

        }


    }

}
/*
      1- Write a program that can only writes unique chars from the given string
       String str = "aaabbbcdddfeee";
       MUST USE ARRAYLIST
       2-Write a program that can find the max and min number, sum of the numbers from the given ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        3-Write a program that can remove the duplicates from the given ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);
 */
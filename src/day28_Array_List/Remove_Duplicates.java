package day28_Array_List;

import java.util.ArrayList;

public class Remove_Duplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);

        ArrayList<Integer> result = new ArrayList<>();//{10,20,30}
        for (Integer each : list) {
            if (result.contains(each)){
                continue;
            }
            result.add(each);
        }
        System.out.println(result);







    }
}

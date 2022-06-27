package SelfStudy;

import java.util.ArrayList;
import java.util.Arrays;

public class Bos12 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        ArrayList<Integer> reverseList = new ArrayList<>();

        for(int i = list.size() -1; i>=0;i--){
            reverseList.add(list.get(i));
        }
        System.out.println(reverseList);

        reverseList2(list);
    }

    private static void reverseList2(ArrayList<Integer> list) {
        ArrayList<Integer> reverseList = new ArrayList<>();

        for(int i = list.size() -1; i>=0;i--){

            reverseList.add(list.get(i));
        }
        System.out.println(reverseList);
    }


}

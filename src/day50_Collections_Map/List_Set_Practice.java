package day50_Collections_Map;

import java.util.*;

public class List_Set_Practice {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println(set);

        //Integer[] array =set.toArray(new Integer[0]);

        List<Integer> list =new ArrayList<>(set);
        System.out.println(list);

        List<String> names = null;

        //System.out.println(names.size());

        System.out.println("-------------------------------");
        //pop() ==> LIFO
        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A','B', 'C', 'D'));

        System.out.println("chars = " + chars);

        ((Stack<Character>) chars).pop();

        System.out.println("chars = " + chars);

        //pop() ==> FIFO
        List<String> names1 = new LinkedList<>();
        names1.addAll(Arrays.asList("James", "Jimmy", "Kathy", "Breanna", "Max"));
        System.out.println(names1);

        ((LinkedList<String>) names1).poll();

        System.out.println(names1);

        ((LinkedList<String>) names1).poll();

        System.out.println(names1);




    }



}

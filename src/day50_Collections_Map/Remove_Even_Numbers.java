package day50_Collections_Map;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Even_Numbers {
    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(1,2,3,4,5,6,100,90,80,75,45,35,25,15) );

        //set.removeIf(p-> (p &2)==0); if we can not use this method we have to do it by loop

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            if (it.next() % 2==0){
                it.remove();
            }
        }
        System.out.println("set = " + set);

        System.out.println("-------------------------------------------");

        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(1,2,3,4,5,6,100,90,80,75,45,35,25,15) );


        for (Iterator<Integer> i = set2.iterator(); i.hasNext(); ) {
            if (i.next() %2==0){
                i.remove();
            }
        }
        System.out.println("set2 = " + set2);
    }
}

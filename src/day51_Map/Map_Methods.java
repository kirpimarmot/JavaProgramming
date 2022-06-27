package day51_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Methods {

    public static void main(String[] args) {

        //student name and scores

        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 85);
        students.put("Maria", 95);
        students.put("Ali",95);
        students.put("Alex",96);
        students.put("Ozan",98);
        students.put("Serkan",97);
        students.put("Andriy",98);

        students.put("Ali",85);
        students.put("Ali",86);
        students.put("Ali",87);

        System.out.println("students = " + students);
        System.out.println("students.size() = " + students.size());

        // display the score of Alex
        System.out.println("Alex: " + students.get("Alex"));

        //replace Ali's score to 90

        students.replace("Ali", 90);

        System.out.println(students);

        //remove the key Method
        students.remove("Alex");
        System.out.println(students);

        students.remove("Ozan");
        System.out.println(students);

        //Contains Key Method
        boolean r1 = students.containsKey("Muhtar");
        boolean r2 = students.containsKey("Serkan");
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        //Contains value Method
        boolean r3 = students.containsValue(97);
        System.out.println("r3 = " + r3);

        //IsEmpty() Method
        System.out.println("students.isEmpty() = " + students.isEmpty());

        System.out.println("-----------------------------------------------");

        //Addall Method
        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);
        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

        System.out.println("-----------------------------------------------");

        //equals Method
        System.out.println(map1==map2);
        System.out.println(map1.equals(map2));

        System.out.println("-----------------------------------------------");

        //Clear Method
        map1.clear();
        map2.clear();

        System.out.println("-----------------------------------------------");

        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

        // Create a map that contains group ID and names of group members


    }
}

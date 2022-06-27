package day51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Practice3 {

    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 145000);
        map.put("Conor", 85000);
        map.put("Josh", 145000);
        map.put("Cory", 145000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);


        String personGettingMaxSalary = "";
        int maxSalary = Integer.MIN_VALUE;
        int minSalary = Integer.MAX_VALUE;


        for (Integer eachValue : map.values()) {

            if (eachValue > maxSalary){
                maxSalary=eachValue;

            }
        }

         for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxSalary){
                System.out.println(entry.getKey());
            }
        }


        /*
        int maxSalary = Collections.max(map.values());


        System.out.println("maxSalarry = " + maxSalary);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxSalary){
                System.out.println(entry.getKey());
              }

              */


    }
}


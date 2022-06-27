package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class Map_Practice1 {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        //  1. Update the "M" to Male and "F" to Female

        /*
        //This is the first approach
        for (String key : employeeMap.keySet()) {
            if (employeeMap.get(key).equals("M")){
                employeeMap.replace(key, "Male");
            }
            if (employeeMap.get(key).equals('F')){
                employeeMap.replace(key, "Female");
            }
        }
        System.out.println(employeeMap);
        */

        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            //System.out.println(entry);
            if (entry.getValue().equalsIgnoreCase("M")) {
                entry.setValue("Male");
                //employeeMap.replace(entry.getKey(), "male");
            }

            if (entry.getValue().equalsIgnoreCase("f")) {
                entry.setValue("Female");
                //employeeMap.replace(entry.getKey(), "Female" );

            }
        }

        System.out.println("employeeMap = " + employeeMap);


        //  2. Display the names of all female employees

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            String eachKey = eachEntry.getKey();
            String eachValue = eachEntry.getValue();

            if (eachValue.equals("Female")) {
                System.out.println(eachKey);
            }
         /*
        //Bu benim yontemim

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {

            if (eachEntry.getValue().equals("Female")){
                String gender = eachEntry.getKey();
                System.out.println(gender);

            }
        }
        */


        }
    }
}
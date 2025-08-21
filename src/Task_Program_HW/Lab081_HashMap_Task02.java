package Task_Program_HW;

/*Program: Iterate Over HashMap in Three Ways
📘 Description:
Create a map with key-value pairs and iterate using:
entrySet()
keySet()
Iterator
Input: {"Name" -> "Dipak", "Role" -> "Tester", "Level" -> "Senior"}
Output
Name -> Dipak
Role -> Tester
Level -> Senior*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Lab081_HashMap_Task02 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Name", "Dipak");
        map.put("Role", "Tester");
        map.put("Level", "Senior");

        // Way 1: Using entrySet()
        System.out.println("Using entrySet():");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Way 2: Using keySet()
        System.out.println("\nUsing keySet():");
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // Way 3: Using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

}

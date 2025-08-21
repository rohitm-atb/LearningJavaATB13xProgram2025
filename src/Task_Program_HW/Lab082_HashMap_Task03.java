package Task_Program_HW;

/*Program: Sort Map by Keys Using TreeMap
📘 Description:
Store data in HashMap, then transfer to TreeMap to sort by keys.
Input: {"Ravi": 80, "Anjali": 95, "Dipak": 75}
Output:
Anjali = 95
Dipak = 75
Ravi = 80*/

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab082_HashMap_Task03 {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Ravi", 80);
        hashMap.put("Anjali", 95);
        hashMap.put("Dipak", 75);

        TreeMap<String, Integer> treeMap = new TreeMap<>(hashMap);

        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

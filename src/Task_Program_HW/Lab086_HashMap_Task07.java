package Task_Program_HW;

/*Program: Filter Students by Name Starting with 'A'
📘 Description:
Store roll numbers and names in a HashMap, print only those starting with 'A'.
Input: {101="Anjali", 102="Dipak", 103="Aman", 104="Ravi"}
Output:
101 -> Anjali
103 -> Aman*/

import java.util.HashMap;
import java.util.Map;

public class Lab086_HashMap_Task07 {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(101, "Anjali");
        students.put(102, "Dipak");
        students.put(103, "Aman");
        students.put(104, "Ravi");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            if (entry.getValue().startsWith("A")) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}

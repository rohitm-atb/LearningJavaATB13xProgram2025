package Task_Program_HW;

/*Program: Find Most Frequent Character in String
📘 Description:
Count frequency of characters and find the one with the highest count.
Input: "aaaabbbcc"
Output:  Most frequent character is: a (4 times)*/

import java.util.HashMap;
import java.util.Map;

public class Lab087_HashMap_Task08 {

    public static void main(String[] args) {
        String input = "aaaabbbcc";
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        char maxChar = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        System.out.println("Most frequent character is: " + maxChar + " (" + maxCount + " times)");
    }
}

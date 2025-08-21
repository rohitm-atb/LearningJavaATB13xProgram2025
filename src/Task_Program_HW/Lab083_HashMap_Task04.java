package Task_Program_HW;
/*Program: Character Frequency Counter
📘 Description:
Count how many times each character appears in a string using HashMap.
Input:
"aabbccddeeff"
Output:
a -> 2
b -> 2
c -> 2
d -> 2
e -> 2
f -> 2*/

import java.util.HashMap;
import java.util.Map;

public class Lab083_HashMap_Task04 {
    public static void main(String[] args) {
        String input = "aabbccddeeff";

        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : input.toCharArray()) {

            freqMap.put(c, freqMap.getOrDefault(c,0) + 1);
        }

       // System.out.println(freqMap);

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }

}

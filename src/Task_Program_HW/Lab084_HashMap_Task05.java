package Task_Program_HW;

/*Program: Find First Non-Repeated Character
📘 Description:
Prints the first character that appears only once using LinkedHashMap.
Input:→"aabbccdeeff"
Output:→ First non-repeated character is: d*/

import java.util.LinkedHashMap;
import java.util.Map;

public class Lab084_HashMap_Task05 {
    public static void main(String[] args) {

        String input = "aabbccdeeff";

        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        for (char c : input.toCharArray())
        {
            freqMap.put(c, freqMap.getOrDefault(c,0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet())
        {
            if (entry.getValue() == 1)
            {
                System.out.println("First non-repeated character is: " + entry.getKey());
                break;
            }
        }
    }
}

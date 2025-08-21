package Task_Program_HW;

/*Program: Group Words by Length Using Map
📘 Description:
Group words based on their length using Map<Integer, List<String>>.
Input: ["Java", "is", "fun", "cool", "Hi"]
Output:
        2 -> [is, Hi]
        3 -> [fun]
        4 -> [Java, cool]*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab085_List_Task06 {
    public static void main(String[] args) {
        String[] words = {"Java", "is", "fun", "cool", "Hi"};
        Map<Integer, List<String>> lengthMap = new HashMap<>();

        for (String word : words) {
            int length = word.length();
            lengthMap.computeIfAbsent(length, k -> new ArrayList<>()).add(word);
        }

        for (Map.Entry<Integer, List<String>> entry : lengthMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

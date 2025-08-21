package Task_Program_HW;
/*1. Program: Word Frequency Counter Using HashMap
📘 Description:
Takes a sentence and prints how many times each word appears using HashMap.
Input: "java is easy and java is powerful"
Output:
java -> 2
is -> 2
easy -> 1
and -> 1
powerful -> 1*/

import java.util.HashMap;
import java.util.Map;

public class Lab080_HashMap_Task01 {
    public static void main(String[] args) {
        String sentence = "java is easy and java is powerful";
        String[] words = sentence.split(" ");
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

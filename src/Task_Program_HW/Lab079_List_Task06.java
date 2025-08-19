package Task_Program_HW;

/*6. Insert in Middle of LinkedList
📘 Description:
Create a LinkedList with fruits: Apple, Banana, Mango.
Insert Orange at index 1 and print the final list.
✅ Expected Output:
Fruits List: [Apple, Orange, Banana, Mango]*/

import java.util.Arrays;
import java.util.LinkedList;

public class Lab079_List_Task06 {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>(Arrays.asList("Apple", "Banana", "Mango"));
        fruits.add(1, "Orange");
        System.out.println("Fruits List: " + fruits);
    }
}

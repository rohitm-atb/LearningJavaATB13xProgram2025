package Task_Program_HW;

/*3. Reverse a LinkedList
📘 Description:
Create a LinkedList and add the following numbers:
10, 20, 30, 40.
Reverse the list and print the output.
✅ Expected Output:
Reversed List:
[40, 30, 20, 10]*/

import java.util.Collections;
import java.util.LinkedList;

public class Lab076_List_Task03 {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Collections.reverse(list);
        System.out.println("Reversed List:");
        System.out.println(list);
    }
}

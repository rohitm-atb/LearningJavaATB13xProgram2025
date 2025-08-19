package Task_Program_HW;

/*2. Remove an Element from ArrayList
📘 Description:
Create an ArrayList with these names: Amit, Neha, Suresh.
Remove the name Neha and display the updated list.
✅ Expected Output:
Names after removal:
[Amit, Suresh]*/

import java.util.ArrayList;

public class Lab075_List_Task02 {
    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        names.add("Amit");
        names.add("Neha");
        names.add("Suresh");
        names.remove("Neha");
        System.out.println("Names after removal:");
        System.out.println(names);
    }
}

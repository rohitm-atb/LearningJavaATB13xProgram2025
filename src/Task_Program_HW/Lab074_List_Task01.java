package Task_Program_HW;

import java.util.ArrayList;

 /*1. Add and Display Elements in ArrayList
📘 Description:
Create an ArrayList of student names. Add the following 5 students:
Dipak, Ravi, Sneha, Priya, Anjali.
Then display all names using a loop.
✅ Expected Output:
Student List:
Dipak
Ravi
Sneha
Priya
Anjali*/

public class Lab074_List_Task01 {
    public static void main(String[] args) {
        ArrayList students = new ArrayList();
        students.add("Dipak");
        students.add("Ravi");
        students.add("Sneha");
        students.add("Priya");
        students.add("Anjali");

        System.out.println("Student List:");
        for (Object name : students) {
            System.out.println(name);
        }
    }
}

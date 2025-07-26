package Task_Program_HW;

/*
Program 7: Demonstrate public Access Modifier
:- Understand how public methods are accessible from anywhere.
📝 Instructions:
Create a class Student with a public method showInfo() that prints "Public Access: Student Info".
In the main() method, create an object of Student.
Call showInfo() directly from anywhere like same class, sub class,
different class same package, in different package it should work without restriction.*/

public class Lab051_AccessModifier_Task07 {
    public static void main(String[] args) {
        Student5 std = new Student5(); // Can access from anywhere
        std.showInfo();
    }
}


class Student5 {
    public void showInfo() {
        System.out.println("Public Access: Student Info");
    }
}
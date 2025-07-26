package Task_Program_HW;

//Program 3: Access parent class variable using super

public class Lab047_AccessModifier_Task03 {
    public static void main(String[] args) {
        Student1 s = new Student1();
        s.printNames();
    }
}


class Person1 {
    String name = "John";
}

class Student1 extends Person1 {
    String name = "Alice";

    void printNames() {
        System.out.println("Child name: " + name);
        System.out.println("Parent name: " + super.name); // Access parent variable
    }
}

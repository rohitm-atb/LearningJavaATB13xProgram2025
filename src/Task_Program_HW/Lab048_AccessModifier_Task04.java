package Task_Program_HW;

//Program 4: Create a Program to Access the private access modifier

public class Lab048_AccessModifier_Task04 {
    public static void main(String[] args) {
        Student2 s = new Student2();
        s.showAge();
    }
}

class Person2 {
    private int age = 25;

    // Provide public method to access private variable
    public int getAge() {
        return age;
    }
}

class Student2 extends Person2 {
    void showAge() {
        // System.out.println(age); // Not allowed directly
        System.out.println("Accessed age using getter: " + getAge());
    }
}
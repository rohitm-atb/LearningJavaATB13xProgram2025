package Task_Program_HW;
//Program 5: default (no modifier) access - same package only

public class Lab049_AccessModifier_Task05 {
    public static void main(String[] args) {
        Student3 s = new Student3(); // Accessing from same package
        s.showDetails();           // Works fine because same package
    }
}

class Student3 {
    void showDetails() { // default access
        System.out.println("Student Details: Default Access");
    }
}
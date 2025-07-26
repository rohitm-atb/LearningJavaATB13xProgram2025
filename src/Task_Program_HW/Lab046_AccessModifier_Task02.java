package Task_Program_HW;
//Program 2: Access parent class method using super

public class Lab046_AccessModifier_Task02 {
    public static void main(String[] args) {
        employee e = new employee();
        e.greet();
    }
}

class Person {
    void greet() {
        System.out.println("Hello from Person.");
    }
}

class employee extends Person {
    void greet() {
        System.out.println("Hello from Student.");
        super.greet(); // Calling parent class method
    }
}
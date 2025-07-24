package Task_Program_HW;
/*Task 4: Greet User
Title: Greet users differently using overloading
Description:
Create a class Greeter with the following methods:
greet() – prints "Hello!"
greet(String name) – prints "Hello, [name]!"
This task teaches overloading based on the number of parameters.*/

public class Lab039_Method_Overloading_Task04 {
    public static void main(String[] args) {
        Greeter g = new Greeter();
        g.greet();
        g.greet("Rohit");
    }
}

class Greeter {
    void greet() {
        System.out.println("Hello!");
    }

    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
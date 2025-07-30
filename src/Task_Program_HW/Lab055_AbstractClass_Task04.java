package Task_Program_HW;

/*Abstract vs Concrete Method
🔶 Objective:
Understand how abstract classes can contain both abstract methods
(which must be implemented in the subclass) and concrete methods (which can be used as-is).
🔶 Steps to Create:
Create an abstract class Parent.
Define one abstract method void show().
Define one concrete method void display() that prints a message.
Create a class Child that extends Parent.
Implement the show() method inside Child.
In the main() method, create an object of Child and call both display() and show().
Expected Output:
Concrete method in abstract class
Abstract method implemented*/

public class Lab055_AbstractClass_Task04 {

    public static void main(String[] args) {

        Child c1 = new Child();
        c1.show();
        c1.display();
    }
}

abstract class Parent
{
    abstract void show();

    void display() {
        System.out.println("Concrete method in abstract class");
    }
}

class Child extends Parent
{
    void show() {
        System.out.println("Abstract method implemented");
    }

}
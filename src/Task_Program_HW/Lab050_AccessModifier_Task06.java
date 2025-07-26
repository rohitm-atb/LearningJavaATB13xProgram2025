package Task_Program_HW;
/*Program 6: Demonstrate protected Access Modifier
:-  Learn how protected members behave in inheritance.
        📝 Instructions:
Create a class Animal with a protected method eat() that prints "Animal is eating".
Create a child class Dog that extends Animal.
Create a method doEat() in Dog class which calls eat() using inheritance.
In main(), create a Dog object and call doEat().*/

public class Lab050_AccessModifier_Task06 {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.doEat(); // Outputs: Animal is eating
    }
}


class Animal2 {
    protected void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog1 extends Animal2 {
    void doEat() {
        eat(); // Accessing protected method from parent class
    }
}

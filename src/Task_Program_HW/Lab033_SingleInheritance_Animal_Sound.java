package Task_Program_HW;

public class Lab033_SingleInheritance_Animal_Sound {

    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.makeSound();  // From Animal class
        myCat.meow();       // From Cat class
    }
}

// Base class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class
class Cat extends Animal {
    void meow() {
        System.out.println("Cat says: Meow");
    }
}

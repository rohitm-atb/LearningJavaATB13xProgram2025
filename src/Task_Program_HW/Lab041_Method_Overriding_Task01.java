package Task_Program_HW;
/*Task 1: Animal Sounds
Title: Override sound behavior in subclasses
Description:
Create a base class Animal with a method sound().
Create subclasses Dog, Cat, and Cow, each overriding sound() to return “Bark”, “Meow”, and “Moo” respectively.
Create an object of each class and call sound()
to see how overriding provides different outputs using the same method name.*/

public class Lab041_Method_Overriding_Task01 {
    public static void main(String[] args) {
        Animal1 a;

        a = new Dog();
        a.sound();

        a = new Cat1();
        a.sound();

        a = new Cow();
        a.sound();
    }
}

class Animal1
{
    void sound()
    {
        System.out.println("Animal Sounds");
    }
}

class Dog extends Animal1
{
    void sound()
    {
        System.out.println("Bark");
    }
}

class Cat1 extends Animal1
{
    void sound()
    {
        System.out.println("Meow");
    }
}

class Cow extends Animal1
{
    void sound()
    {
        System.out.println("Moo");
    }
}
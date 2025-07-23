package ex21_Oops_Polymorphism.MethodOverriding;

public class Lab004_OverRiding_Ex04 {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.sound();
    }
}

class Animal{

    void sound()
    {
        System.out.println("Default Sound!!");
    }
}

class Dog extends Animal
{
    @Override
    void sound()
    {
        System.out.println("Bark!!");
    }
}
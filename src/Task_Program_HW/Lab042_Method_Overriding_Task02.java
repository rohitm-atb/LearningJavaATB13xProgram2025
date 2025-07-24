package Task_Program_HW;
/*Task 2: Vehicle Start
Title: Demonstrate engine start behavior using overriding
Description:
Create a base class Vehicle with a method start().
Create Bike and Car classes that override the start() method:
Bike prints "Kick start the bike"
Car prints "Turn the key to start the car"
This shows how polymorphism works with method overriding.*/

public class Lab042_Method_Overriding_Task02 {
    public static void main(String[] args) {
        Vehicle1 v;

        v = new Vehicle1();
        v.start();

        v = new Bike1();
        v.start();

        v = new Car();
        v.start();
    }
}


class Vehicle1
{
    void  start()
    {
        System.out.println("Vehicle Start Behavior");
    }
}

class Bike1 extends Vehicle1
{
    void  start()
    {
        System.out.println("Kick start the bike");
    }
}

class Car extends Vehicle1
{
    void  start()
    {
        System.out.println("Turn the key to start the car");
    }
}
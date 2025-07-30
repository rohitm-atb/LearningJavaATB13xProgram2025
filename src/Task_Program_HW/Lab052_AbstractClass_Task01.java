package Task_Program_HW;

/*1. Animal Sound - Abstract Method Implementation
Description: Create an abstract class Animal with an abstract method makeSound().
Extend it in Dog and Cat.
 Expected Output:
Dog barks
Cat meows*/

public class Lab052_AbstractClass_Task01 {

 public static void main(String[] args) {
  Animal3 d = new Dog3();
  d.makeSound();
  Animal3 c = new Cat3();
  c.makeSound();
 }

}

abstract class Animal3{

 abstract void makeSound();
}

class Dog3 extends Animal3
{

 void makeSound()
 {
  System.out.println("Dog barks");
 }

}

class Cat3 extends Animal3
{

 void makeSound()
 {
  System.out.println("Cat meows");
 }

}
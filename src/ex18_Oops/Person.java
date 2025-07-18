package ex18_Oops;

public class Person {

    // These are called properties, attributes, instance variables, member variables.
    String name;
    int age;
    String height;
    String gender;
    boolean is_married;

    // These are called as Behaviours, Member Functions, Functions, Methods.
    void walk(){
        System.out.println("Walking");
    }

    void eat(String food){
        System.out.println("eating");
    }

    String sleep(){
        System.out.println("sleeping");
        return null;
    }

    String food(int a){
        System.out.println("food");
        return null;
    }
}

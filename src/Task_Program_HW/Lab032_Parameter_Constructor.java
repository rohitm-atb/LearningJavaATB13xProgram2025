package Task_Program_HW;

public class Lab032_Parameter_Constructor {
// Program 2: Parameterized Constructor Example
    //Definition:
    //A parameterized constructor is a constructor that takes arguments to initialize
    // object properties with specific values.

    public static void main(String[] args) {

        Student std = new Student("Rohit", 38);
        std.display();

    }
}

class Student {
    String name;
    int age;

    Student(String std_name, int std_age)
    {
        this.name = std_name;
        this.age = std_age;
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

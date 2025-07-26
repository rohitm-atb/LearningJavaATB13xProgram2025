package Task_Program_HW;

//Program 1: Access parent class constructor using super()

public class Lab045_AccessModifier_Task01 {
    public static void main(String[] args) {
        student s = new student();
    }
}

class person{

    person() {
        System.out.println("Person Constructor Called");
    }
}

class student extends person
{
    student() {
    super();
        System.out.println("Student Constructor Called");
    }
}
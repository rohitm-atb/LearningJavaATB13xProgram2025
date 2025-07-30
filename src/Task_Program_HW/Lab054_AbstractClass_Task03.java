package Task_Program_HW;

/*Abstract Class with Constructor
Description: Show that abstract class can have constructor.
Print message from constructor and method.
Expected Output:
Abstract class constructor called
Method from abstract class*/

public class Lab054_AbstractClass_Task03 {
    public static void main(String[] args) {
        Demo obj = new DemoChild();
        obj.showMessage();
    }
}

abstract class Demo {
    Demo() {
        System.out.println("Abstract class constructor called");
    }

    void showMessage() {
        System.out.println("Method from abstract class");
    }
}

class DemoChild extends Demo {
    // No need to override showMessage()
}


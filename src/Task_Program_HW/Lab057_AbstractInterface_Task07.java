package Task_Program_HW;

/*Interface Constants
🔶 Objective:
Demonstrate how to use constants (public static final variables) in interfaces.
🔶 Steps:
Create an interface SpeedLimit with a constant MAX_SPEED = 120.
In a class Car, access and print the constant.
Do not modify the constant—it should behave like a final value.
🔶 Expected Output:
Max Speed is: 120*/

public class Lab057_AbstractInterface_Task07 {
    public static void main(String[] args) {
        Car1 car = new Car1();
        car.showSpeedLimit();
    }
}


interface SpeedLimit {
    int MAX_SPEED = 120; // public static final by default
}

class Car1 implements SpeedLimit {
    void showSpeedLimit() {
        System.out.println("Max Speed is: " + MAX_SPEED);
    }
}
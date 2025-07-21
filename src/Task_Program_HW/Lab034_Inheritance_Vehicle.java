package Task_Program_HW;

public class Lab034_Inheritance_Vehicle {

    public static void main(String[] args) {
        Bike myBike = new Bike();  // Observe constructor order
    }
}
// Parent class
class Vehicle {
    Vehicle() {
        System.out.println("Vehicle is ready");
    }
}

// Child class
class Bike extends Vehicle {
    Bike() {
        System.out.println("Bike is ready");
    }
}
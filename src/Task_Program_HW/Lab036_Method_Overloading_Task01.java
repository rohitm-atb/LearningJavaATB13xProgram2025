package Task_Program_HW;

/*Task 1: Add Two Numbers
Title: Overload a method to add different types of numbers
Description:
Create a class Calculator with two overloaded methods add(int a, int b) and add(double a, double b).
The int version should add two integers.
The double version should add two decimal numbers.
In the main method, call both versions to demonstrate how overloading works with data types.*/

public class Lab036_Method_Overloading_Task01 {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        int result1 = calc.add(10, 11);
        double result2 = calc.add(10.11,22.33);
    }
}

class Calculator
{
    int add (int a, int b)
    {
        System.out.println("Sum (int): " + (a + b));
        return a + b;
    }

    double add (double a, double b)
    {
        System.out.println("Sum (double): " + (a + b));
        return a + b;
    }
}


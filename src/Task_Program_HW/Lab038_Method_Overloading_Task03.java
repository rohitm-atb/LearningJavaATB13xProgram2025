package Task_Program_HW;
/*Task 3: Multiply Numbers
Title: Multiply using overloaded methods
Description:
Create a class MathOperations with two multiply() methods:
One takes two integers and returns the product
Another takes three integers and returns their product
This helps students understand how Java distinguishes methods based on parameter count.*/

public class Lab038_Method_Overloading_Task03 {
    public static void main(String[] args) {

        MathOperations m = new MathOperations();
        System.out.println("Product of 2 numbers: " + m.multiply(3, 4));
        System.out.println("Product of 3 numbers: " + m.multiply(2, 3, 4));

    }
}

class MathOperations
{
    int multiply(int a, int b)
    {
        return a * b;
    }

    int multiply(int a, int b, int c)
    {
        return a * b * c;
    }
}
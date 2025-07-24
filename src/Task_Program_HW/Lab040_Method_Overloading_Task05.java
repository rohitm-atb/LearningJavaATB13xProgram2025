package Task_Program_HW;

/*Task 5: Find Maximum
Title: Find max using overloaded functions
Description:
Create a class Utility with two methods named max():
max(int a, int b) returns the larger of two integers
max(int a, int b, int c) returns the larger of three integers
max(double a, double b) returns the larger of two decimal values
Add method calls in main() to compare different types.*/

public class Lab040_Method_Overloading_Task05 {
    public static void main(String[] args) {
        Utility u = new Utility();
        System.out.println("Max (2 ints): " + u.max(10, 20));
        System.out.println("Max (3 ints): " + u.max(10, 25, 15));
        System.out.println("Max (2 doubles): " + u.max(3.5, 4.2));
    }
}

class Utility {
    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    double max(double a, double b) {
        return (a > b) ? a : b;
    }
}

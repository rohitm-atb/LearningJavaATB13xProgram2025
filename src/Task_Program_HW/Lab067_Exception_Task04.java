package Task_Program_HW;

/*Task 4: Nested Try-Catch
📘 Description:
Write a program with a try-catch block inside another try-catch block.
Example: Outer block for ArithmeticException, inner for ArrayIndexOutOfBoundsException.*/

public class Lab067_Exception_Task04 {

    public static void main(String[] args) {

            try {
                System.out.println("Outer try block");
                try {
                    int[] array = new int[5];
                    System.out.println(array[10]); // Inner: ArrayIndexOutOfBoundsException
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Inner catch: " + e.getMessage());
                }
                int result = 10 / 0; // Outer: ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Outer catch: " + e.getMessage());
            }
        }
    }


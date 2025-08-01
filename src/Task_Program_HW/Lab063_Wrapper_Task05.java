package Task_Program_HW;

/*Task 5: Compare Wrapper objects using == and equals()
📘 Description:
Compare two Integer objects using == and .equals() and print the results.
Expected Output:
a == b: true
c == d: false
a.equals(b): true
c.equals(d): true*/

public class Lab063_Wrapper_Task05 {
    public static void main(String[] args) {

        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        System.out.println("a == b: " + (a == b));               // true (within Integer cache range)
        System.out.println("c == d: " + (c == d));               // false (outside cache range)
        System.out.println("a.equals(b): " + a.equals(b));       // true
        System.out.println("c.equals(d): " + c.equals(d));       // true
    }
}

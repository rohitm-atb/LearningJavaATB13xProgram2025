package Task_Program_HW;

/*Task 3: Convert int to Integer using Autoboxing
📘 Description:
Declare an int, assign a value, and convert it to Integer using autoboxing.
📤 Expected Output:
Primitive value: 10
Wrapper object: 10*/

public class Lab061_Wrapper_Task03 {

    public static void main(String[] args) {

        int prm = 10;
        System.out.println("Primitive value: " +prm);

        Integer wrp = prm;
        System.out.println("Wrapper object: " +wrp);

    }

}

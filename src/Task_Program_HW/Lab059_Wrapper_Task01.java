package Task_Program_HW;

/*Task 1: Autoboxing and Unboxing
📘 Description:
Demonstrate automatic conversion from int to Integer (Autoboxing) and back from Integer to int (Unboxing).
📤 Expected Output:
Primitive: 50
Wrapper: 50
Unboxed again: 50*/

public class Lab059_Wrapper_Task01 {

    public static void main(String[] args) {

        int prm = 50;
        System.out.println("Primitive: " +prm);

        Integer wrp = prm;
        System.out.println("Wrapper: " +wrp);

        int unbox = prm;
        System.out.println("Unboxed again: " +unbox);
    }

}

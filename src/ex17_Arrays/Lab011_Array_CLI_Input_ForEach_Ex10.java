package ex17_Arrays;

public class Lab011_Array_CLI_Input_ForEach_Ex10 {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        System.out.println("------------------------");

        for (Object o : args)
        {
            System.out.println(o);
        }
    }
}

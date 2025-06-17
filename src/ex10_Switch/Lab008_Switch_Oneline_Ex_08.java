package ex10_Switch;

public class Lab008_Switch_Oneline_Ex_08 {

    public static void main(String[] args) {

        //  No need of break keyword
        // one line supported.

        int item_code = 002;

        switch (item_code)
        {
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default ->  System.out.println("Default");


        }
    }
}

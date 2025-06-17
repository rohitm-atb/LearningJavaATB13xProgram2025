package ex10_Switch;

public class Lab009_Switch_Ex_09 {

    public static void main(String[] args) {

        //  No need of break keyword
        // one line supported.

        int item_code = 9;

        switch (item_code)
        {
//            case 001,005,007 -> System.out.println("001");
//            case 002,004 -> System.out.println("002");
//            case 003,006 -> System.out.println("003");
//            default ->  System.out.println("Default");

            case 1, 2, 3 :
                System.out.println("This is Common Item");
                break;

            case 4, 5, 6, 9 :
                System.out.println("This is Electric Item");
                break;

            default:
                System.out.println("Default");

                break;



        }
    }
}

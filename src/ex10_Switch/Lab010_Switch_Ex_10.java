package ex10_Switch;

public class Lab010_Switch_Ex_10 {

    public static void main(String[] args) {
        int a = 5;

        switch (-2)
        {

            case -2 : System.out.println("Don't Print"); break;
            case 2 :
                System.out.println("Print");
                break;

            default : System.out.println("Bye");
            break;

        }
    }
}

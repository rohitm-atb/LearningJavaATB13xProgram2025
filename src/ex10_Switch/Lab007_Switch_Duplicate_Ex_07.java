package ex10_Switch;

public class Lab007_Switch_Duplicate_Ex_07 {

    public static void main(String[] args) {
//duplicate case label
        char ch = 'A';

        switch (ch)
        {
            case 65 :
                System.out.println("Match ASCII");
                break;

//            case 65 :
//                System.out.println("Match ASCII");
//                break;

            default:
                System.out.println("No Match");
                break;
        }

    }
}

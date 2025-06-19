package ex11_For_Loop;

public class Lab013_Loop_Ex13 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i == 3)

            {
                continue; // skip the code and move to next to top
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}

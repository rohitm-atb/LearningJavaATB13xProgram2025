package ex11_For_Loop;

public class Lab014_Loop_Ex14 {

    public static void main(String[] args) {

        //  Find the Odd numbers from 1 to 50.
        for (int i = 1; i <=50; i++)
        {
            if(i%2==0)
            {
               continue;
            }
            System.out.println("Odd Number : "+i);
        }
    }
}

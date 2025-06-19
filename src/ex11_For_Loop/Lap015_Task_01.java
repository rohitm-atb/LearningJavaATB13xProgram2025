package ex11_For_Loop;

public class Lap015_Task_01 {

    public static void main(String[] args) {

        //Count vowels and consonants in a String.  -pramod, → vowels - 2, consnants - 4

        String str = "pramod";

        int vowels = 0;
        int consonants = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vowels++;
            }
            else if ((ch >= 'a' && ch <= 'z'))
            {
                consonants++;
            }


        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}

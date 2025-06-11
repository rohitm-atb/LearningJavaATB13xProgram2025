package ex03_Literals;

public class Lab005_Ex05 {

    public static void main(String[] args) {

        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("ATB13Class");
        System.out.println("ATB13"+new_line+"Class");
        System.out.println("ATB13"+tab_line+"Class");
        System.out.println("ATB13"+back_space+"Class");
        System.out.println("ATB13"+carriage_return+"Class");


        System.out.println("Hi, This is a First line"+new_line+"This is second line\nThis is Third line");
    }
}

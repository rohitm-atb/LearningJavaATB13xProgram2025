package ex14_Functions;

public class Lab003_User_Def_02 {
    public static void main(String[] args) {

        name_f1();
       int result = return_int();
        System.out.println(result);
    }

    static void name_f1(){
        System.out.println("No Return");
    }

    static int return_int()
    {
        return 20;
    }
    static boolean return_boolean(){
        return true;
    }
    static float return_float_pi_value(){
        return 3.14f;
    }

    static long return_long(){
        return 10l;
    }
    static String return_String(){
        return "Rohit";
    }
}

package ex14_Functions;

public class Lab005_User_Def_04 {

    public static void main(String[] args) {

        // User Defined Functions.

        // 1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4. With Parameters and With Return Type


//1.Without Parameters and Without Return Type
        wp_wr_fun();

        // 2.Without Parameters but With Return Type
        String msg = wp_with_ret_fun();
        System.out.println(msg);

        //3.With Parameters and Without Return Type
        wp_wo_rt_fun("Anushka", 100, 120);
        wp_wo_rt_fun("Virat", 111, 220);

        // 4. With Parameters and With Return Type

        int result = wp_wrt_sum_two_num(5,6);
        System.out.println(result);

        int result1 = wp_wrt_sum_three_num(5,6,2);
        System.out.println(result1);
    }

    // 1.Without Parameters and Without Return Type
    static void wp_wr_fun() {
        System.out.println("1.Without Parameters and Without Return Type");
    }

    // 2.Without Parameters but With Return Type
    static String wp_with_ret_fun() {
        System.out.println("2.Without Parameters but With Return Type");
        return "With Return Type";
    }

    // 3.With Parameters and Without Return Type

    static void wp_wo_rt_fun(String name, int emp_no, double salary) {
        System.out.println("3.With Parameters and Without Return Type");
        System.out.println("Employee Name : " + name + "\tEmployee Number : " + emp_no + "\tSalary : " + salary);
    }

    // 4. With Parameters and With Return Type
    static int wp_wrt_sum_two_num (int a, int b)
    {
        return a + b;
    }

    static int wp_wrt_sum_three_num (int a, int b, int c)
    {
        return a + b - c;
    }

}

package multilevel_Inheritance;

import single_Inheritence.Test_Case_1;
import single_Inheritence.Test_Case_2;

public class Lab003_Multilevel_Inheritance {

    public static void main(String[] args) {

        Grand_Father gf = new Grand_Father();
        gf.home();
        System.out.println(gf.gold_gf);

        System.out.println(" -- ");

        Father f1 = new Father();
        f1.home();
        System.out.println(f1.gold_gf);

        System.out.println(" -- ");

        Son s1 = new Son();
        System.out.println(s1.gold_gf);
        s1.home();
        s1.BHK2();
        s1.BHK1();

    }
}

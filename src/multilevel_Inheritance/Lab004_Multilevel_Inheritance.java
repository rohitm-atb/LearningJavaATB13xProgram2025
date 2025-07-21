package multilevel_Inheritance;

public class Lab004_Multilevel_Inheritance {

    public static void main(String[] args) {

        Grand_Father gf1 = new Son(); // Dynamic Dispatch
        gf1.home();
        System.out.println(gf1.gold_gf);

        System.out.println(" -- ");

        Grand_Father gf2 = new Father();
       gf2.home();
        System.out.println(gf2.gold_gf);

        System.out.println(" -- ");

        Father f1 = new Son();
        System.out.println(f1.gold_gf);
        f1.home();
        f1.BHK1();


    }
}

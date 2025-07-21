package ex20_Oops_Inheritence;

import org.w3c.dom.ls.LSOutput;

public class Lab001_Inheritence {

    public static void main(String[] args) {

        Father f1 = new Father();
        System.out.println(f1.gold_f);
        f1.BHK2();

        son s1 = new son();
        System.out.println(s1.gold_f);
        s1.BHK2();
        s1.BHK3();

    }
}


class Father {

    int gold_f = 100;

    void BHK2()
    {
        System.out.println("2 BHK Father");
    }
}

class  son extends  Father{

    void BHK3(){

        System.out.println("3 BHK Son");
    }


        }

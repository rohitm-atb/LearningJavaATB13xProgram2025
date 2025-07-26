package ex23_Oops_AccessModifier.criminal;

import ex23_Oops_AccessModifier.police.Cop;

public class Thief {

    public static void main(String[] args) {
        Cop thief = new Cop(100);
        thief.gun = 100;
    }
}

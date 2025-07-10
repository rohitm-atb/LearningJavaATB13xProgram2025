package ex17_Arrays;

public class Lab013_Array_Copy_Ex12 {

    public static void main(String[] args) {

        int [] original = {22, 33, 55, 88};
        int [] copyOrg = new int[original.length];
        System.arraycopy(original, 0, copyOrg, 0, original.length);


        for (int i = 0; i < copyOrg.length; i++) {
            System.out.println(copyOrg[i]);

        }
    }
}

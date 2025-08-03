package ex31_Exceptions;

public class Lab016_Excp_Ex16 {
    public static void main(String[] args) throws CurrencyMisMatchCustomException {
        Bank sbi = new Bank("INR",100);
        Bank icici = new Bank("INR",123);
        int total  = sbi.add(icici);
        System.out.println(total);

        Bank jp_chase = new Bank("USD",101);
        int total_new = sbi.add(jp_chase);
        System.out.println(total_new);
    }
}

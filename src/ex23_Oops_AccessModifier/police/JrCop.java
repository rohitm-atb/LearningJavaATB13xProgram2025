package ex23_Oops_AccessModifier.police;

public interface JrCop {
    public static void main(String[] args) {
        Cop jr = new Cop(10);
        jr.canIShoot();
    }
}

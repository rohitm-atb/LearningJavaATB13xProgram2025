package ex23_Oops_AccessModifier.police;

public class Cop {
    public int gun;
    private String iCard;

    public Cop (int bullet)
    {
        this.gun = bullet;
    }

    protected void canIShoot()
    {
        System.out.println("Yes you Can");
    }
}

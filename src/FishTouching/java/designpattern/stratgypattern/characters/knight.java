package FishTouching.java.designpattern.stratgypattern.characters;

public class knight extends character{
    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }

    @Override
    public void display() {
        System.out.println("Knight");
    }
}

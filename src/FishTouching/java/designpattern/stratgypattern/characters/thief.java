package FishTouching.java.designpattern.stratgypattern.characters;

public class thief extends character{
    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }

    @Override
    public void display() {
        System.out.println("Thief");
    }
}

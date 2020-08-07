package FishTouching.java.designpattern.stratgypattern.characters;

public class sorcerer extends character{
    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }

    @Override
    public void display() {
        System.out.println("Sorcerer");
    }
}

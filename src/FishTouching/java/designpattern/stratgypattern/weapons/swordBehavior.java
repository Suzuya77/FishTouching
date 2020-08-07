package FishTouching.java.designpattern.stratgypattern.weapons;

public class swordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Use sword");
    }
}

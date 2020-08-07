package FishTouching.java.designpattern.stratgypattern.weapons;

public class magicBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Use magic");
    }
}

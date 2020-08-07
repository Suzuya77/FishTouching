package FishTouching.java.designpattern.stratgypattern.weapons;

public class knifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Use knife");
    }
}

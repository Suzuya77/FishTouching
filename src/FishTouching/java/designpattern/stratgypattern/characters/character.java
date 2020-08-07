package FishTouching.java.designpattern.stratgypattern.characters;

import FishTouching.java.designpattern.stratgypattern.weapons.WeaponBehavior;

public abstract class character {
    protected WeaponBehavior weaponBehavior;

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public abstract void fight();
    public abstract void display();
}

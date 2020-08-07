package FishTouching.java.designpattern.decoratorpattern.raccoon.component;

import FishTouching.java.designpattern.decoratorpattern.raccoon.weapon.WeaponBehavior;

public abstract class Character {
    protected WeaponBehavior weaponBehavior;
    String name;

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public String getName() {
        return name;
    }

    public void useWeapons(){
        weaponBehavior.useWeapon();
    }
}

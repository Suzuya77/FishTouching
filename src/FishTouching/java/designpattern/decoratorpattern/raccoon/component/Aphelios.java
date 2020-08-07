package FishTouching.java.designpattern.decoratorpattern.raccoon.component;

public class Aphelios extends Character {

    public Aphelios(String name) {
        this.name = name + "(" + this.getClass().getSimpleName() + ")  升级了";
    }

    @Override
    public void useWeapons() {
        weaponBehavior.useWeapon();
    }
}

package FishTouching.java.designpattern.decoratorpattern.raccoon.component;

public class Aphelios extends Character {

    public Aphelios(String name) {
        this.name = name + "(" + this.getClass().getSimpleName() + ")  levelling up with";
    }

    @Override
    public void useWeapons() {
        weaponBehavior.useWeapon();
    }
}

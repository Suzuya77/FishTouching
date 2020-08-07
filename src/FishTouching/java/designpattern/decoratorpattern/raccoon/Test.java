package FishTouching.java.designpattern.decoratorpattern.raccoon;

import FishTouching.java.designpattern.decoratorpattern.raccoon.component.Aphelios;
import FishTouching.java.designpattern.decoratorpattern.raccoon.component.Character;
import FishTouching.java.designpattern.decoratorpattern.raccoon.condiment.AttackDamage;
import FishTouching.java.designpattern.decoratorpattern.raccoon.condiment.AttackSpeed;
import FishTouching.java.designpattern.decoratorpattern.raccoon.condiment.PhysicalPenetration;
import FishTouching.java.designpattern.decoratorpattern.raccoon.weapon.坠明;
import FishTouching.java.designpattern.decoratorpattern.raccoon.weapon.折镜;

public class Test {
    public static void main(String[] args) {
        Character character1 = new Aphelios("Virgil丶Downfall");


        character1 = new AttackDamage(character1);
        character1 = new PhysicalPenetration(character1);
        character1 = new AttackSpeed(character1);
        character1.setWeaponBehavior(new 坠明());

        System.out.println(character1.getName());
        character1.useWeapons();
        character1.useWeapons();

        character1.setWeaponBehavior(new 折镜());
        character1.useWeapons();
    }
}

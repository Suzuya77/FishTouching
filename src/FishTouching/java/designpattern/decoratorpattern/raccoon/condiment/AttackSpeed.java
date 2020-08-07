package FishTouching.java.designpattern.decoratorpattern.raccoon.condiment;

import FishTouching.java.designpattern.decoratorpattern.raccoon.component.Character;

public class AttackSpeed extends SkillDecorator{
    public AttackSpeed(Character character) {
        this.character = character;
    }

//    @Override
//    public void useWeapons() {
//        weaponBehavior.useWeapon();
//    }

    @Override
    public String getName() {
        return character.getName() + " AttackSpeed";
    }
}

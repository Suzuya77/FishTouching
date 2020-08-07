package FishTouching.java.designpattern.decoratorpattern.raccoon.condiment;

import FishTouching.java.designpattern.decoratorpattern.raccoon.component.Character;

public class PhysicalPenetration extends SkillDecorator{
    public PhysicalPenetration(Character character) {
        this.character = character;
    }

//    @Override
//    public void useWeapons() {
//        weaponBehavior.useWeapon();
//    }

    @Override
    public String getName() {
        return character.getName() + " PhysicalPenetration";
    }
}

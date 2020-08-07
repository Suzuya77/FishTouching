package FishTouching.java.designpattern.stratgypattern;

import FishTouching.java.designpattern.stratgypattern.characters.character;
import FishTouching.java.designpattern.stratgypattern.characters.knight;
import FishTouching.java.designpattern.stratgypattern.characters.sorcerer;
import FishTouching.java.designpattern.stratgypattern.characters.thief;
import FishTouching.java.designpattern.stratgypattern.weapons.axeBehavior;
import FishTouching.java.designpattern.stratgypattern.weapons.knifeBehavior;
import FishTouching.java.designpattern.stratgypattern.weapons.magicBehavior;
import FishTouching.java.designpattern.stratgypattern.weapons.swordBehavior;

public class test {
    public static void main(String[] args) {

        character Nxy = new knight();
        character Luis = new thief();
        character Ziv = new sorcerer();

        Nxy.setWeaponBehavior(new swordBehavior());
        Nxy.display();
        Nxy.fight();

        Luis.setWeaponBehavior(new knifeBehavior());
        Luis.display();
        Luis.fight();

        Ziv.setWeaponBehavior(new magicBehavior());
        Ziv.display();
        Ziv.fight();

        Luis.setWeaponBehavior(new axeBehavior());
        Nxy.display();
        Nxy.fight();
    }


}

package FishTouching.java.designpattern.decoratorpattern.raccoon.condiment;

import FishTouching.java.designpattern.decoratorpattern.raccoon.component.Character;

public abstract class SkillDecorator extends Character {
    Character character;

    abstract public String getName();


}

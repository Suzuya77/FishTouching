package FishTouching.java.designpattern.decoratorpattern.headfirst;

import FishTouching.java.designpattern.decoratorpattern.headfirst.component.Beverage;
import FishTouching.java.designpattern.decoratorpattern.headfirst.component.DarkRoast;
import FishTouching.java.designpattern.decoratorpattern.headfirst.component.Espresso;
import FishTouching.java.designpattern.decoratorpattern.headfirst.condiment.Milk;
import FishTouching.java.designpattern.decoratorpattern.headfirst.condiment.Mocha;
import FishTouching.java.designpattern.decoratorpattern.headfirst.condiment.Soy;
import FishTouching.java.designpattern.decoratorpattern.headfirst.condiment.Whip;

public class DecoratorModeTest {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();

        beverage1 = new Milk(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);
        beverage1 = new Whip(beverage1);

        System.out.println(beverage1.getDescription());
        System.out.println("COST: "+beverage1.cost());

        Beverage beverage2 = new DarkRoast();

        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDescription());
        System.out.println("COST: "+beverage2.cost());
    }
}

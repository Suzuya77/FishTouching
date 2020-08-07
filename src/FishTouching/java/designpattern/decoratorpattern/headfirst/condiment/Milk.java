package FishTouching.java.designpattern.decoratorpattern.headfirst.condiment;

import FishTouching.java.designpattern.decoratorpattern.headfirst.component.Beverage;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + .1;
    }
}
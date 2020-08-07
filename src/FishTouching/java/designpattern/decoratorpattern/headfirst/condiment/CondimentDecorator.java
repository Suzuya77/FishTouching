package FishTouching.java.designpattern.decoratorpattern.headfirst.condiment;

import FishTouching.java.designpattern.decoratorpattern.headfirst.component.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}

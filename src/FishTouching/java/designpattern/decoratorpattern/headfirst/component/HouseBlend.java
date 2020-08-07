package FishTouching.java.designpattern.decoratorpattern.headfirst.component;

public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "HouseHold";
    }

    @Override
    public double cost() {
        return .89;
    }
}

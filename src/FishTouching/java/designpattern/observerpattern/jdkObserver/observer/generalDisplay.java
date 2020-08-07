package FishTouching.java.designpattern.observerpattern.jdkObserver.observer;

import FishTouching.java.designpattern.observerpattern.jdkObserver.displayFunction;
import FishTouching.java.designpattern.observerpattern.jdkObserver.subject.weatherData;

import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public class generalDisplay implements Observer, displayFunction {
    private Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public generalDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg){
        if (o instanceof weatherData){
            weatherData wdata = (weatherData) o;
            this.observable = wdata;
            this.temperature = wdata.getTemperature();
            this.humidity = wdata.getHumidity();
            this.pressure = wdata.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println();
        System.out.println("Data updated from weather monitor center.");
        System.out.println("Current time: " + new Date().toString());
        System.out.println("Current conditions: " + temperature + " °C degrees and "
                + humidity + " % humidity and " + pressure + " kpa.");
    }
}

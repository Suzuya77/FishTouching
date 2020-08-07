package FishTouching.java.designpattern.observerpattern.jdkObserver;

import FishTouching.java.designpattern.observerpattern.jdkObserver.observer.generalDisplay;
import FishTouching.java.designpattern.observerpattern.jdkObserver.subject.weatherData;

import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.TimeUnit;

public class observerTest {
    public static void main(String[] args) throws InterruptedException {
        Observable weather = new weatherData();
        Observer obs = new generalDisplay(weather);

        ((weatherData) weather).setMeasurements(29,20,101.5f);
        TimeUnit.SECONDS.sleep(10);
        ((weatherData) weather).setMeasurements(30,22,101.2f);
        TimeUnit.SECONDS.sleep(10);
        ((weatherData) weather).setMeasurements(27,25,100.3f);
    }
}

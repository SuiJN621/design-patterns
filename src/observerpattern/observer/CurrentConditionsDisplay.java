package observerpattern.observer;

import observerpattern.subject.Subject;
import observerpattern.subject.WeatherData;

/**
 * @author Sui
 * @date 2018/6/17 22:01
 */
public class CurrentConditionsDisplay implements Observer, Display {

    private Subject subject;

    private float temperature;

    private float humidity;

    public CurrentConditionsDisplay(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(Subject subject) {
        if(subject instanceof WeatherData){
            this.temperature = ((WeatherData) subject).getTemperature();
            this.humidity = ((WeatherData) subject).getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity.");
    }
}

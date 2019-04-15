package observerpattern.subject;

import java.util.ArrayList;
import java.util.List;

import observerpattern.observer.Observer;

/**
 * @author Sui
 * @date 2018/6/17 21:46
 */
public class WeatherData implements Subject {

    private float temperature;

    private float humidity;

    private float pressure;

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if(index >= 0) observers.remove(index);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(this));
    }

    public void setWeatherData(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}

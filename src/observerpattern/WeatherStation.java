package observerpattern;

import observerpattern.observer.CurrentConditionsDisplay;
import observerpattern.subject.WeatherData;

/**
 * @author Sui
 * @date 2018/6/17 22:00
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setWeatherData(10, 20, 30);
        weatherData.setWeatherData(11, 24, 45);
        weatherData.setWeatherData(8, 22, 20);
    }
}

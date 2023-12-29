package chapter2.weather.observer;

import chapter2.weather.subject.WeatherData;

/**
 * Shows the current measurements from the WeatherData object
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    /**
     * The temperature
     */
    private float temp;

    /**
     * The humidity
     */
    private float humidity;

    /**
     * The weather data
     */
    private WeatherData weatherData;

    /**
     * The constructor
     *
     * @param weatherData the weather data
     */
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.temp = 0.0f;
        this.humidity = 0.0f;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + this.temp + "F degrees and " + this.humidity + "% humidity");
    }
}

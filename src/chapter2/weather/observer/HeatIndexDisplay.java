package chapter2.weather.observer;

import chapter2.weather.subject.WeatherData;

/**
 * Display for heat
 */
public class HeatIndexDisplay implements Observer, DisplayElement {

    /**
     * The heat index
     */
    private float heatIndex;

    /**
     * The weather data
     */
    private WeatherData weatherData;

    /**
     * The Constructor
     *
     * @param weatherData the weather data
     */
    public HeatIndexDisplay(WeatherData weatherData) {
        this.heatIndex = 0.0f;
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.heatIndex = computeHeatIndex(temp, humidity);
        display();
    }

    /**
     * Computes the heat index
     *
     * @param temp     the temperature
     * @param humidity the humidity
     * @return the heat index computed
     */
    private float computeHeatIndex(float temp, float humidity) {
        //noinspection OverlyComplexArithmeticExpression,MagicNumber
        return (float) ((16.923 + (0.185212 * temp) + (5.37941 * humidity) - (0.100254 * temp * humidity)
                + (0.00941695 * (temp * temp)) + (0.00728898 * (humidity * humidity))
                + (0.000345372 * (temp * temp * humidity)) - (0.000814971 * (temp * humidity * humidity)) +
                (0.0000102102 * (temp * temp * humidity * humidity)) - (0.000038646 * (temp * temp * temp)) +
                (0.0000291583 * (humidity * humidity * humidity)) + (0.00000142721 * (temp * temp * temp * humidity)) +
                (0.000000197483 * (temp * humidity * humidity * humidity)) -
                (0.0000000218429 * (temp * temp * temp * humidity * humidity)) +
                0.000000000843296 * (temp * temp * humidity * humidity * humidity)) -
                (0.0000000000481975 * (temp * temp * temp * humidity * humidity * humidity)));
    }

    @Override
    public void display() {
        System.out.println("Heat index is " + this.heatIndex);
    }
}

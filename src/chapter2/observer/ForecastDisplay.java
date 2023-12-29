package chapter2.observer;

import chapter2.subject.WeatherData;

/**
 * Shows the weather forecast based on the barometer
 */
public class ForecastDisplay implements Observer, DisplayElement {

    /**
     * The default pressure value
     */
    private static final float DEFAULT_PRESSURE = 30.0f;

    /**
     * The current pressure
     */
    private float currentPressure;

    /**
     * The last pressure
     */
    private float lastPressure;

    /**
     * The weather data
     */
    private WeatherData weatherData;

    /**
     * The constructor
     *
     * @param weatherData the weather data
     */
    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.currentPressure = DEFAULT_PRESSURE;
        this.lastPressure = DEFAULT_PRESSURE;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.lastPressure = this.currentPressure;
        this.currentPressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (this.currentPressure > this.lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (0.0f == Float.compare(this.currentPressure, this.lastPressure)) {
            System.out.println("More of the same");
        } else if (this.currentPressure < this.lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}

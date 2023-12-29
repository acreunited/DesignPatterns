package chapter2.observer;

import chapter2.subject.WeatherData;

/**
 * Keeps track of the min/average/max measurements and displays them
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    /**
     * The highest temperature
     */
    private float maxTemp;

    /**
     * The lowest temperature
     */
    private float minTemp;

    /**
     * The sum of all temperatures
     */
    private float tempSum;

    /**
     * The number of readings (so we can get the average)
     */
    private int numReadings;

    /**
     * The weather data
     */
    private WeatherData weatherData;

    /**
     * The constructor
     *
     * @param weatherData the weather data
     */
    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.maxTemp = 0.0f;
        //noinspection MagicNumber
        this.minTemp = 200.0f;
        this.tempSum = 0.0f;
        this.numReadings = 0;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.tempSum += temp;
        this.numReadings++;

        if (temp > this.maxTemp) {
            this.maxTemp = temp;
        }

        if (temp < this.minTemp) {
            this.minTemp = temp;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (this.tempSum / this.numReadings)
                + "/" + this.maxTemp + "/" + this.minTemp);
    }
}

package chapter2.weather.subject;

import chapter2.weather.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * The Subject that retrieves the information of the weather and updates the Observers
 */
public class WeatherData implements Subject {

    /**
     * A list of Observers that are registered
     */
    private List<Observer> observers;

    /**
     * The temperature
     */
    private float temp;

    /**
     * The humidity
     */
    private float humidity;

    /**
     * The pressure
     */
    private float pressure;

    /**
     * The Constructor
     */
    public WeatherData() {
        this.observers = new ArrayList<>();
        this.temp = 0.0f;
        this.humidity = 0.0f;
        this.pressure = 0.0f;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update(this.temp, this.humidity, this.pressure);
        }
    }

    /**
     * This method is called each time there's a change in the weather data
     * It notifies the Observers from the Weather Station
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * Updates the weather wth the new conditions and informs the Observers
     *
     * @param temp the temperature
     * @param humidity the humidity
     * @param pressure the pressure
     */
    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}

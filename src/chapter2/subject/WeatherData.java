package chapter2.subject;

/**
 * The Subject that retrieves the information of the weather and updates the Observers
 */
public class WeatherData implements Subject {

    /**
     * Empty constructor
     */
    public WeatherData() {
        // empty
    }

    @Override
    public void registerObserver() {

    }

    @Override
    public void removeObserver() {

    }

    @Override
    public void notifyObserver() {

    }

    /**
     * Retrieves the temperature
     *
     * @return the temperature
     */
    private float retrieveTemperature() {
        return 0f;
    }

    /**
     * Retrieves the humidity
     *
     * @return the humidity
     */
    private float retrieveHumidity() {
        return 0f;
    }

    /**
     * Retrieves the pressure
     *
     * @return the pressure
     */
    private float retrievePressure() {
        return 0f;
    }

    /**
     * This method is called each time there's a change in the weather data
     * It retrieves the new values and informs the Observers
     */
    public void measurementsChanged() {

    }
}

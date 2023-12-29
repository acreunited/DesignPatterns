package chapter2;

import chapter2.observer.CurrentConditionsDisplay;
import chapter2.observer.ForecastDisplay;
import chapter2.observer.HeatIndexDisplay;
import chapter2.observer.StatisticsDisplay;
import chapter2.subject.WeatherData;

/**
 * Runs the Weather application
 */
public final class WeatherStation {

    /**
     * Private empty constructor
     */
    private WeatherStation() {
        // empty
    }

    /**
     * Main method
     * @param args the args (none is used)
     */
    @SuppressWarnings("MagicNumber")
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80.0f, 65.0f, 30.4f);
        weatherData.setMeasurements(82.0f, 70.0f, 29.2f);
        weatherData.setMeasurements(78.0f, 90.0f, 29.2f);
    }
}

package weather;

import observer.*;

public class CurrentForecast implements Observer {
    Subject subject;
    private float temperature;
    private float humidity;

    public CurrentForecast(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void update(Subject subject) {

        if (subject instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)subject;
            temperature = weatherData.getTemperature();
            humidity = weatherData.getHumidity();
        }
    }

    public void removeFromSubscription() {
        subject.removeObserver(this);
    }

    public String toString() {
        return String.format("Current Conditions: %.2f F degrees and %.2f %% humidity",
                temperature, humidity);
    }
}

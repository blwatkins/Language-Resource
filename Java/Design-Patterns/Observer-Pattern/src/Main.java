import weather.*;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentForecast currentForecast = new CurrentForecast(weatherData);
        weatherData.setTemperature(80);
        weatherData.setHumidity(65);
        weatherData.setPressure(30.4f);
        System.out.println(currentForecast);

        currentForecast.removeFromSubscription();
        weatherData.setTemperature(82);
        weatherData.setHumidity(70);
        weatherData.setPressure(29.2f);
        System.out.println(currentForecast);
    }
}

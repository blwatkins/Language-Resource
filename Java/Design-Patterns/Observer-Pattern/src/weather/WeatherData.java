package weather;

import java.util.ArrayList;
import java.util.List;

import observer.Subject;
import observer.Observer;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
        notifyObservers();
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {

        for (Observer observer: observers) {
            observer.update(this);
        }
    }
}

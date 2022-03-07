package weatherApp;

import java.util.ArrayList;


public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();

    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver( Observer o) {
        int i = observers.indexOf(o);
        if( i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
       for (Observer o : observers) {
         o.update(this.temp, this.humidity, this.pressure);
       }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements( float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}

package weatherApp;
public class WeatherTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(81, 34, 31.4f);
        weatherData.setMeasurements(20, 64, 37.4f);
    }
}

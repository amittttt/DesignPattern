package ObserverPattern;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);
		weatherData.setMeasurments(90, 64, 23);
		weatherData.setMeasurments(20, 24, 63);
		weatherData.setMeasurments(50, 44, 53);
		
	}
}

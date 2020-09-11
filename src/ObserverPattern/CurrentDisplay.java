package ObserverPattern;

public class CurrentDisplay implements DisplayElement, Observer{
	private float temp;
	private float humidity;
	private Subject weatherData;
	
	public CurrentDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.humidity = humidity;
		this.temp = temp;
		display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display Current way : here is the temprature : "+ temp +" Humidity : "+ humidity);
	}

}

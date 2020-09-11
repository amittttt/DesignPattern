package ObserverPattern;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	private float temprature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		if(observers.contains(o)) 
			System.out.println("Dude you are already registered..");
		else {
			observers.add(o);
			System.out.println("Congratulations.. you are added successfully");
		}
	}

	@Override
	public void removeObserver(Observer o) {
		if(observers.contains(o)) {
			observers.remove(o);
			System.out.println("oops... we removed you on your request...");
		}else {
			System.out.println("Object is not the part of observer...");
		}
		
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer ob : observers) {
			ob.update(temprature, humidity, pressure);
		}
	}
	
	public void mesaurementsChanged() {
		notifyObserver();
	}
	
	// Set new Measurments:
	public void setMeasurments(float temprature, float humidity, float pressure) {
		this.humidity = humidity;
		this.temprature = temprature;
		this.pressure = pressure;
		mesaurementsChanged();
	}

}

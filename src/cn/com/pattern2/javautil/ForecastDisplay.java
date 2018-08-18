package cn.com.pattern2.javautil;

import java.util.Observable;
import java.util.Observer;

import cn.com.pattern2.DisplayElement;

public class ForecastDisplay implements Observer, DisplayElement {

	private float currentPressure = 29.92f; 
	private float lastPressure;
	private Observable observable;
	
	public ForecastDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Forecast conditions: " + currentPressure
				+ "ForecastPressure and " + lastPressure + "lastPressure");
	}

	@Override
	public void update(Observable o, Object arg) {
		if (observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)observable;
			lastPressure = currentPressure; 
			currentPressure = weatherData.getPressure();
			display();
		}
	}

}

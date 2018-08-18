package cn.com.pattern12.day2;

public interface QuackObservable {
	public void registerObserver(Observer observer);
	
	public void notifyObservers();
	
}

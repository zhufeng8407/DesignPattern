package cn.com.pattern12.day2;

public class DuckCall implements Quackable {
	
	Observable observable;
	
	

	public DuckCall() {
		super();
		observable = new Observable(this);
	}



	@Override
	public void quack() {
		System.out.println("Kwak");

	}



	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}



	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}

}

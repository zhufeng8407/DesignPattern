package cn.com.pattern12.day2;

public class RubberDuck implements Quackable {

	Observable observable;
	
	
	public RubberDuck() {
		super();
		observable = new Observable(this);
	}


	@Override
	public void quack() {
		System.out.println("Squeak");

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

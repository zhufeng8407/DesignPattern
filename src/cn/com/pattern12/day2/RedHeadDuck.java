package cn.com.pattern12.day2;

public class RedHeadDuck implements Quackable {

	Observable observable;

	public RedHeadDuck() {
		super();
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("RedHeadDuck Quack");

	}

	public void fly() {
		System.out.println("I'm flying");

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

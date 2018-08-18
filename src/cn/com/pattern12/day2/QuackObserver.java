package cn.com.pattern12.day2;

public class QuackObserver implements Observer {

	@Override
	public void update(QuackObservable duck) {
		System.out.println("QuackObserver: " + duck + " just quacked.");
	}

}

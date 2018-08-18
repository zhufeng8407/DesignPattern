package cn.com.pattern12.day2;

import java.util.ArrayList;

public class Observable implements QuackObservable {
	ArrayList<Observer> observerList;
	QuackObservable duck;
	
	
	public Observable(QuackObservable duck) {
		super();
		this.duck = duck;
		this.observerList = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observerList) {
			observer.update(duck);
		}

	}

}

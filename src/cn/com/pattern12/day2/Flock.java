package cn.com.pattern12.day2;

import java.util.ArrayList;

public class Flock implements Observer{
	ArrayList<Quackable> quackList = new ArrayList<Quackable>();
	
	
	@Override
	public void update(QuackObservable duck) {
		System.out.println("flock list : " + duck + " just quacked. " );
	}

}

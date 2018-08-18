package cn.com.pattern12.day1;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
	ArrayList<Quackable> quackList;
	
	
	public Flock(ArrayList<Quackable> quackList) {
		super();
		this.quackList = quackList;
	}

	@Override
	public void quack() {
		Iterator<Quackable> it = quackList.iterator();
		while(it.hasNext()) {
			Quackable quack = it.next();
			quack.quack();
		}
	}
	
	public void add(Quackable quack) {
		quackList.add(quack);
	}

}

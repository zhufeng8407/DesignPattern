package cn.com.pattern7.day2;

import java.util.Iterator;

public class IteratorAdapter implements Iterator {

	java.util.Enumeration enumeration;
	
	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	@Override
	public Object next() {
		return enumeration.nextElement(); 
	}

	@Override
	public void remove() {
		
	}
	
	

}

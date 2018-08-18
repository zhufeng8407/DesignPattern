package cn.com.pattern9.day1;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
	
	@SuppressWarnings("rawtypes")
	ArrayList menuItems;
	
	public PancakeHouseMenuIterator(@SuppressWarnings("rawtypes") ArrayList menuItems) {
		super();
		this.menuItems = menuItems;
	}

	public boolean hasNext() {
		return menuItems.iterator().hasNext();
	}

	@Override
	public Object next() {
		return menuItems.iterator().next();
	}

}

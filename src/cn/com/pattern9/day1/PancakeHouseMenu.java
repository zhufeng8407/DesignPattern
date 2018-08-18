package cn.com.pattern9.day1;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu{
	@SuppressWarnings("rawtypes")
	ArrayList menuItems;
	
	@Override
	public Iterator createIterator() {
		return new PancakeHouseMenuIterator(menuItems);
	}
	
	
	
}

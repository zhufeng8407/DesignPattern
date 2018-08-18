package cn.com.pattern9.day1;

public class DinnerMenu implements Menu{
	static final int MAX_ITEMS = 6;
	
	int numberOfItems = 0;
	
	MenuItem[] menuItems;
	
	@Override
	public Iterator createIterator() {
		return new DinnerMenuIterator(menuItems);
	}
	
	
}

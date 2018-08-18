package cn.com.pattern9.day1;

public class DinnerMenuIterator implements Iterator {

	MenuItem[] items;
	int position = 0;

	public DinnerMenuIterator(MenuItem[] items) {
		super();
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (position > items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		return items[position++];
	}

}

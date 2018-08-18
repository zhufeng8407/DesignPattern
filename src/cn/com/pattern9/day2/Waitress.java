package cn.com.pattern9.day2;

public class Waitress {
	MenuComponent allMenus;

	public Waitress(MenuComponent allMenus) {
		super();
		this.allMenus = allMenus;
	}

	public void printMenu() {
		allMenus.print();
	}
}

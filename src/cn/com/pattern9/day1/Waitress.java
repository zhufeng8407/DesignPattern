package cn.com.pattern9.day1;

public class Waitress {
	Menu pancakeHouseMenu;
	Menu dinnerMenu;
	public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu) {
		super();
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinnerMenu = dinnerMenu;
	}
	
	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinnerIterator = dinnerMenu.createIterator();
		printMenu(pancakeIterator);
		printMenu(dinnerIterator);
		
	}
	
	public void printMenu(Iterator it) {
		while(it.hasNext()) {
			MenuItem menuItem = (MenuItem) it.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + "-- ");
			System.out.println(menuItem.getDescription() + ".");
		}
	}
}

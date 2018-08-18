package cn.com.pattern9.day2;

public class MenuTestDrive {

	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
		
		MenuComponent dinnerMenu = new Menu("DINNER MENU", "Lunch");
		
		MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
		
		MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course");
		
		MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
		
		allMenus.add(pancakeHouseMenu);
		
		allMenus.add(dinnerMenu);
		
		allMenus.add(cafeMenu);
		
		dinnerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce bread", true, 3.89));
		dinnerMenu.add(dessertMenu);
		
		dessertMenu.add(new MenuItem("Apple Pie", "Apple Pie with a flakey crust with ice cream", true, 1.59));
		
		pancakeHouseMenu.add(new MenuItem("Burrito", "A large burrito, with whole pinto beans", true, 4.29));
		
		cafeMenu.add(new MenuItem("XingBaKe", "A Coffee, with Xingbake", false, 43.00));
		
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
	}

}

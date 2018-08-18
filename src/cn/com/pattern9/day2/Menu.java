package cn.com.pattern9.day2;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
	ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	
	String name;
	String description;
	
	
	public Menu(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	
	
	@Override
	public void remove(MenuComponent component) {
		menuComponents.remove(component);
	}
	
	@Override
	public MenuComponent getChild(int index) {
		return menuComponents.get(index);
	}

	@Override
	public void add(MenuComponent enuComponent) {
		menuComponents.add(enuComponent);
	}
	
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	public void print() {
		System.out.print(getName() + ", ");
		System.out.println(getDescription() + ",");
		System.out.println("-------------------------");
		
		Iterator<MenuComponent> it = menuComponents.iterator();
		while(it.hasNext()) {
			MenuComponent menuComponent = (MenuComponent) it.next();
			menuComponent.print();
		}
	}
}

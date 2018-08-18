package cn.com.pattern8.day1;

public abstract class CaffeineBeverage {
	final void prepareRecipe() {
		boilWater();
		brew();
		pourIncup();
		addCondiments();
	}
	
	abstract void brew();
	
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("Boiling water");
	}
	
	void pourIncup() {
		System.out.println("Pouring into cup");
	}
}

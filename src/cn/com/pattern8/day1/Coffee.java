package cn.com.pattern8.day1;

public class Coffee extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding Suger and milk");
	}

}

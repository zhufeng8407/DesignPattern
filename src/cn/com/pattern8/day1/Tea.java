package cn.com.pattern8.day1;

public class Tea extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("Steeping the tea");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding lemon");
	}

}

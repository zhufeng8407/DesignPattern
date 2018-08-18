package cn.com.pattern3;

public abstract class Condiment extends Beverage {

	@Override
	public double cost() {
		return 0.2;
	}

	public abstract String getDescription();
}

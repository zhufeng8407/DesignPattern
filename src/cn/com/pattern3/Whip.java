package cn.com.pattern3;

public class Whip extends Beverage {

	private Beverage beverage;

	public Whip(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return 0.31 + beverage.cost();
	}

}

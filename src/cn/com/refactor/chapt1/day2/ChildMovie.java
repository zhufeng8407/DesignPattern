package cn.com.refactor.chapt1.day2;

public class ChildMovie implements Movie {
	private int priceCode = 2;

	@Override
	public int getPriceCode() {
		return priceCode;
	}

	public void setPriceCode(int priceCode) {
		this.priceCode = priceCode;
	}

	public double getCharge(int dayRented) {
		double thisAmount = 1.5;
		if (dayRented > 3)
			thisAmount += (dayRented - 3) * 1.5;

		return thisAmount;
	}
}

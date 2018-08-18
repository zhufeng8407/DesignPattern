package cn.com.refactor.chapt1;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private List<Rental> rentals = new ArrayList<Rental>();

	private String name;

	public void addRental(Rental rental) {
		rentals.add(rental);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		String result = "Rental Record for " + getName() + "\n";
		for (Rental rental : rentals) {
			double thisAmount = 0;

			switch (rental.getMovie().getPriceCode()) {
			case Movie.REGULAR:
				thisAmount += 2;
				if (rental.getDaysRented() > 2)
					thisAmount += (rental.getDaysRented() - 2) * 1.5;
				break;
			case Movie.NEW_RELEASE:
				thisAmount += rental.getDaysRented() * 3;
				break;
			case Movie.CHILDRENS:
				thisAmount += 1.5;
				if (rental.getDaysRented() > 3)
					thisAmount += (rental.getDaysRented() - 3) * 1.5;
			}
			
			frequentRenterPoints++;
			if (Movie.NEW_RELEASE == rental.getMovie().getPriceCode() && rental.getDaysRented() > 1)
				frequentRenterPoints++;

			totalAmount += thisAmount;

		}

		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints) + " points ";
		return result;
	}
}

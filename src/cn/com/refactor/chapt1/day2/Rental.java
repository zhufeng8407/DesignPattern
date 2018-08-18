package cn.com.refactor.chapt1.day2;

public class Rental {
	private Movie movie;
	
	private int daysRented;

	public Rental(Movie movie, int daysRented) {
		super();
		this.movie = movie;
		this.daysRented = daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public int getDaysRented() {
		return daysRented;
	}
	
	public double amountFor() {
		return movie.getCharge(daysRented);
	}
}

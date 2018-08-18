package cn.com.pattern8.day1;

public class CaffeineBeverageTest {

	public static void main(String[] args) {
		CaffeineBeverage teaBeverage = new Tea();
		teaBeverage.prepareRecipe();
		System.out.println("-------------------------");
		CaffeineBeverage coffeeBevrage = new Coffee();
		coffeeBevrage.prepareRecipe();
	}

}

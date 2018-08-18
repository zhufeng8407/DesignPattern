package cn.com.pattern4;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Elan orded a " + pizza.getName() );
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel orded a " + pizza.getName() );
	}

}

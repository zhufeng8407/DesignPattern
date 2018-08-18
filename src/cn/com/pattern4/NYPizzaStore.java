package cn.com.pattern4;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		if("cheese".equals(type)) {
			return new NYStyleCheesePizza();
		} else if("veggie".equals(type)) {
			return new NYStyleVeggiePizza();
		} else if ("clam".equals(type)) {
			return new NYStyleClamPizza();
		} else if ("pepperoni".equals(type)) {
			return new NYStylePepperoniPizza();
		} else return null;
	}

}

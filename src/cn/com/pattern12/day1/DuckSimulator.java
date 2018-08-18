package cn.com.pattern12.day1;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator duckSimulator = new DuckSimulator();
		duckSimulator.simulate();
	}
	
	void simulate() {
		Quackable mallardDuck = new MallardDuck();
		Quackable redheadDuck = new RedHeadDuck();
		
		Quackable duckCall = new DuckCall();
		Quackable rubberDuck = new RubberDuck();
		
		Quackable gooseDuck = new GooseAdapter(new Goose());
		
		System.out.println("\nDuck DuckSimulator");
		
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
	}
	
	void simulate(Quackable duck) {
		duck.quack();
	}

}

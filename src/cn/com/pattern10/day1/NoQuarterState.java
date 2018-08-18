package cn.com.pattern10.day1;

public class NoQuarterState implements State {
	GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You have not insert a quarter");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there is no quarter");

	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first");

	}

}

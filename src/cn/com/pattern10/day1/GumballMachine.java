package cn.com.pattern10.day1;

public class GumballMachine {
	State state;

	State noQuarterState;

	State soldOutState;

	State soldState;

	State hasQuarterState;

	int count = 0;

	public GumballMachine(int numberGumballs) {
		super();
		this.count = numberGumballs;
		noQuarterState = new NoQuarterState(this);
		soldOutState = new SoldOutState(this);
		soldState = new SoldState(this);
		hasQuarterState = new HasQuarterState(this);
		
		if (numberGumballs > 0) {
			state = noQuarterState;
		}

	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot..............");
		if (count != 0) {
			count--;
		}
	}

}

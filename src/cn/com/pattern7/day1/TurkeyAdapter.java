package cn.com.pattern7.day1;

public class TurkeyAdapter implements Duck {

	Turkey turkey;
	
	
	public TurkeyAdapter(Turkey turkey) {
		super();
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		turkey.fly();
	}

}

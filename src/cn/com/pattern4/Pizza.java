package cn.com.pattern4;

public abstract class Pizza {
	
	String name;
	double cost;

	public void prepare() {
		System.out.println("Prepare Pizza");
		
	}

	public void bake() {
		System.out.println("bake Pizza");
		
	}

	public void cut() {
		System.out.println("cut Pizza");
		
	}

	public void box() {
		System.out.println("box Pizza");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	
}

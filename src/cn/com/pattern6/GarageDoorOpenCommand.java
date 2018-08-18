package cn.com.pattern6;

public class GarageDoorOpenCommand implements Command {

	GarageDoor garageDoor;
	
	@Override
	public void execute() {
		garageDoor.open();
	}

}

package cn.com.pattern6;

public class SimpleRemoteControl {
	Command command;
	
	public SimpleRemoteControl() {
		
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void buttonWasPressed() {
		command.execute();
	}
}

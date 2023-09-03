package com.commanddesignpattern;

public class Invoker {
	
	Command command;
	public void setCommand(Command command) {
		this.command=command;
	}
	
	public void performAction() {
		this.command.execute();
	}

}

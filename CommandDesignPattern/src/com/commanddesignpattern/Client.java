package com.commanddesignpattern;

public class Client {

	public static void main(String[] args) {
		
		FileSystem fs=new FileSystem();
		Invoker ivk=new Invoker();
		
		//command for opening file
		ivk.setCommand(new OpenFileCommand(fs));
		ivk.performAction();//just think like a button, performed by client

		//command for closing File
		ivk.setCommand(new CloseFileCommand(fs));
		ivk.performAction();//just think like a button, performed by client
		
		//command for coping file
		ivk.setCommand(new CopyFile(fs));
		ivk.performAction();
		
		//command for pasting file
		ivk.setCommand(new PasteFile(fs));
		ivk.performAction();
	}

}

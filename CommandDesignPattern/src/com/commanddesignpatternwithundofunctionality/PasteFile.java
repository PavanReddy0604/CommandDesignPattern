package com.commanddesignpatternwithundofunctionality;

public class PasteFile implements Command {
	
	FileSystem fs;
	 
	public PasteFile(FileSystem fileSystem) {
		this.fs=fileSystem;
	}
	

	@Override
	public void execute() {
		this.fs.pasteFile();

	}


	@Override
	public void undo() {
		this.fs.copyFile();
		
	}

}

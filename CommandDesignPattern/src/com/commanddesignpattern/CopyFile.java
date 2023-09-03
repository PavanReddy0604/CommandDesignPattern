package com.commanddesignpattern;

public class CopyFile implements Command {

	FileSystem fileSystem;
	
	public CopyFile(FileSystem fs) {
		this.fileSystem=fs;
		}
	
	@Override
	public void execute() {
		this.fileSystem.copyFile();

	}

}

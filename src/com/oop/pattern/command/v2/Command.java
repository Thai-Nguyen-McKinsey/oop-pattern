package com.oop.pattern.command.v2;

public interface Command {
	public void run();
}

class FileOpen implements Command {
	private File file;
	
	public FileOpen(File file) {
		this.file = file;
	}

	@Override
	public void run() {
		file.open();
	}
	
}


class FileClose implements Command {
	private File file;
	
	public FileClose(File file) {
		this.file = file;
	}
	
	@Override
	public void run() {
		file.close();
	}
}
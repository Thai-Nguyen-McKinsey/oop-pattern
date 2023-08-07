package com.oop.pattern.command.v2;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

	private final List<Command> commands = new ArrayList<>();

	public void execute(Command action) {
		commands.add(action);
		action.run();
	}
}

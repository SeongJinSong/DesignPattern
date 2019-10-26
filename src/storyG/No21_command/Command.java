package storyG.No21_command;

public interface Command extends Comparable<Command> {
	public void execute();
}

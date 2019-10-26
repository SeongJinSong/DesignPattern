package storyG.No21_command;

import java.util.PriorityQueue;

public class Main2 {
	public static void main(String[] args) {
		PriorityQueue<Command> queue = new PriorityQueue<>();
		
		queue.add(new StringPrintCommand("A"));
		queue.add(new StringPrintCommand("AB"));
		queue.add(new StringPrintCommand("ABC"));
		queue.add(new StringPrintCommand("ABCD"));
		
		for(Command command : queue) {
			command.execute();
		}
	}
}

package storyG.No18_memento.org;

public class Memento {
	String state;
	protected Memento (String state) {
		this.state = state;
	}
	protected String getState() {
		return this.state;
	}
}

package storyG.No15_observer.obser2;

import java.util.Observable;

public class Button extends Observable{
	public void onClick() {
		setChanged();
		notifyObservers();
	}
}

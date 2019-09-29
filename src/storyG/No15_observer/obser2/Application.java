package storyG.No15_observer.obser2;

import java.util.Observable;
import java.util.Observer;

public class Application {
	public static void main(String[] args) {
		Button button = new Button();
		button.addObserver(new Observer() {
			
			@Override
			public void update(Observable o, Object arg) {
				// TODO Auto-generated method stub
				System.out.println(o + " is clicked");
			}
		});
		
		button.onClick();
		button.onClick();
		button.onClick();
	}
}

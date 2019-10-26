package storyG.No15_observer.obser3;

import storyG.No15_observer.obser3.Observable.Observer;

public class Application {
	/*
	 * 1.���׸� 
	 * 2.��������Ʈ
	 * 3.���ο� �������� �ִ´�.
	 */
	public static void main(String[] args) {
		Button button = new Button();
		button.addObserver(new Observer<String>() {
			
			@Override
			public void update(Observable<String> o, String arg) {
				// TODO Auto-generated method stub
				System.out.println(o+" is clicked");
			}
		});
		
		button.onClick();
		button.onClick();
		button.onClick();
	}
}

package storyG.No15_observer.obser3;

import storyG.No15_observer.obser3.Observable.Observer;

public class Application {
	/*
	 * 1.제네릭 
	 * 2.델리게이트
	 * 3.내부에 옵저버를 넣는다.
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

package storyG.No15_observer.obser1;

import storyG.No15_observer.obser1.Button.OnClickListener;

public class Main {
	public static void main(String[] args) {
		Button button = new Button();
		
		button.setOnClickOListener(new ButtonClick());
		button.onClick();
		
		button.setOnClickOListener(new OnClickListener() {
			
			@Override
			public void onClick(Button button) {
				// TODO Auto-generated method stub
				System.out.println(button + " is Clicked");
			}
		});
		button.onClick();
	}
}
class ButtonClick implements OnClickListener{
	@Override
	public void onClick(Button button) {
		// TODO Auto-generated method stub
		System.out.println(button + " is clicked");
	}
}
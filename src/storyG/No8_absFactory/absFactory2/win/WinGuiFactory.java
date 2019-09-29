package storyG.No8_absFactory.absFactory2.win;

import storyG.No8_absFactory.absFactory2.abst.Button;
import storyG.No8_absFactory.absFactory2.abst.GuiFac;
import storyG.No8_absFactory.absFactory2.abst.TextArea;

public class WinGuiFactory implements GuiFac {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WinButton();
	}

	@Override
	public TextArea createTextArea() {
		// TODO Auto-generated method stub
		return new WinTextArea();
	}

}

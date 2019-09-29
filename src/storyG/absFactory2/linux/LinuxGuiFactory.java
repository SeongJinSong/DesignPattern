package storyG.absFactory2.linux;

import storyG.absFactory2.abst.Button;
import storyG.absFactory2.abst.GuiFac;
import storyG.absFactory2.abst.TextArea;

public class LinuxGuiFactory implements GuiFac {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new LinuxButton();
	}

	@Override
	public TextArea createTextArea() {
		// TODO Auto-generated method stub
		return new LinuxTextArea();
	}

}

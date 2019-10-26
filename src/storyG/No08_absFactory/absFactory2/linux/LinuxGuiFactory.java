package storyG.No08_absFactory.absFactory2.linux;

import storyG.No08_absFactory.absFactory2.abst.Button;
import storyG.No08_absFactory.absFactory2.abst.GuiFac;
import storyG.No08_absFactory.absFactory2.abst.TextArea;

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

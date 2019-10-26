package storyG.No08_absFactory.absFactory2.mac;

import storyG.No08_absFactory.absFactory2.abst.Button;
import storyG.No08_absFactory.absFactory2.abst.GuiFac;
import storyG.No08_absFactory.absFactory2.abst.TextArea;

public class MacGuiFactory implements GuiFac {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacButton();
	}

	@Override
	public TextArea createTextArea() {
		// TODO Auto-generated method stub
		return new MacTextArea();
	}

}

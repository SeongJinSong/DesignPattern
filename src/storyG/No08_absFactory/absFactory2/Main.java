package storyG.No08_absFactory.absFactory2;

import storyG.No08_absFactory.absFactory2.abst.Button;
import storyG.No08_absFactory.absFactory2.abst.GuiFac;
import storyG.No08_absFactory.absFactory2.abst.TextArea;
import storyG.No08_absFactory.absFactory2.concrete.FactoryInstance;
import storyG.No08_absFactory.absFactory2.win.WinGuiFactory;

public class Main {
	public static void main(String[] args) {
		GuiFac fac = FactoryInstance.getGuiFac();
		
		/* �Ʒ��� ���� �ڵ��� �ϸ� ���ϴ� ���̴�. */
		//LinuxGuiFactory fac = new LinuxGuiFactory();
		//MacGuiFactory fac = new MacGuiFactory();
		//WinGuiFactory fac = new WinGuiFactory();
		
		Button button = fac.createButton();
		TextArea area = fac.createTextArea();
		
		button.Click();
		System.out.println(area.getText());
	}
}

package storyG.strategy.del_ex;

import storyG.strategy.if_ex.Ainterface;
import storyG.strategy.if_ex.AinterfaceImpl;

public class AObj {
	Ainterface ainterface;
	public AObj() {
		ainterface = new AinterfaceImpl();
	}
	public void funcAA() {
		
		//�����Ѵ�
		ainterface.funcA();
		ainterface.funcA();
	}
}

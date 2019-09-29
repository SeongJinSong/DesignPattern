package storyG.No1_strategy.del_ex;

import storyG.No1_strategy.if_ex.Ainterface;
import storyG.No1_strategy.if_ex.AinterfaceImpl;

public class AObj {
	Ainterface ainterface;
	public AObj() {
		ainterface = new AinterfaceImpl();
	}
	public void funcAA() {
		
		//위임한다
		ainterface.funcA();
		ainterface.funcA();
	}
}

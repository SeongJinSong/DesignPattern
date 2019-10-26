package storyG.No14_facade;

import storyG.No14_facade.system.Facade;

public class Main {
	/* 
	 * 복잡한 과정을 간단하게 표현하는 퍼사드 패턴을 이해한다.
	 * 키워드 : 단순한 접근
	 */
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.process();
	}
}

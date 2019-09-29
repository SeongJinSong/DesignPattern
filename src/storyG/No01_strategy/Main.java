package storyG.No01_strategy;

import storyG.No01_strategy.del_ex.AObj;
import storyG.No01_strategy.game_ex.AX;
import storyG.No01_strategy.game_ex.GameCharactor;
import storyG.No01_strategy.game_ex.Knife;
import storyG.No01_strategy.game_ex.Sword;
import storyG.No01_strategy.if_ex.Ainterface;
import storyG.No01_strategy.if_ex.AinterfaceImpl;

public class Main {
	public static void main(String[] args) {
		Ainterface ainterface = new AinterfaceImpl();
		
		/*interface란 통로
			1. 기능에 대한 선언과 구현의 분리
			2. 기능을 호출하는 통로*/
		ainterface.funcA();
		
		/*delegate
			- 특정 객체의 기능을 사용하기 위해 다른 객체의 기능을 호출하는 것*/
		AObj aObj = new AObj();
		aObj.funcAA();
		/*스트레티지 패턴
		 	여러 알고리즘을 하나의 추상적인 접근점을 만들어 접근점에서 서로 교환 가능하도록 하는 패턴
		 */
		GameCharactor character = new GameCharactor();
		character.attack();
		
		character.setWeapon(new Knife());
		character.attack();
		
		character.setWeapon(new Sword());
		character.attack();
		
		character.setWeapon(new AX());
		character.attack();
	}
}

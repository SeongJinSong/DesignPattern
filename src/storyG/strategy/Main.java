package storyG.strategy;

import storyG.strategy.del_ex.AObj;
import storyG.strategy.game_ex.AX;
import storyG.strategy.game_ex.GameCharactor;
import storyG.strategy.game_ex.Knife;
import storyG.strategy.game_ex.Sword;
import storyG.strategy.if_ex.Ainterface;
import storyG.strategy.if_ex.AinterfaceImpl;

public class Main {
	public static void main(String[] args) {
		Ainterface ainterface = new AinterfaceImpl();
		
		/*interface�� ���
			1. ��ɿ� ���� ����� ������ �и�
			2. ����� ȣ���ϴ� ���*/
		ainterface.funcA();
		
		/*delegate
			- Ư�� ��ü�� ����� ����ϱ� ���� �ٸ� ��ü�� ����� ȣ���ϴ� ��*/
		AObj aObj = new AObj();
		aObj.funcAA();
		/*��Ʈ��Ƽ�� ����
		 	���� �˰����� �ϳ��� �߻����� �������� ����� ���������� ���� ��ȯ �����ϵ��� �ϴ� ����
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

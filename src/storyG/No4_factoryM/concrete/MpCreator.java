package storyG.No4_factoryM.concrete;

import java.util.Date;

import storyG.No4_factoryM.framework.Item;
import storyG.No4_factoryM.framework.ItemCreator;

public class MpCreator  extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		// TODO Auto-generated method stub
		System.out.println("데이터베이스에서 마력 회복 물약의 정보를 가져옵니다.");
		System.out.println("데이터 베이스에 또 접근"); 
		//구조와 구현 분리를  --> main함수 수정 필요없음
	}

	@Override
	protected void createItemLog() {
		// TODO Auto-generated method stub
		System.out.println("마력 회복 물약을 새로 생성했습니다."+new Date());
	}

	@Override
	protected Item createItem() {
		// TODO Auto-generated method stub
		return new MpPotion();
	}

}
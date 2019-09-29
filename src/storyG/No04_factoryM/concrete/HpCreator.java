package storyG.No04_factoryM.concrete;

import java.util.Date;

import storyG.No04_factoryM.framework.Item;
import storyG.No04_factoryM.framework.ItemCreator;

public class HpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		// TODO Auto-generated method stub
		System.out.println("데이터베이스에서 체력 회복 물약의 정보를 가져옵니다.");
	}

	@Override
	protected void createItemLog() {
		// TODO Auto-generated method stub
		System.out.println("체력 회복 물약을 새로 생성했습니다."+new Date());
	}

	@Override
	protected Item createItem() {
		// TODO Auto-generated method stub
		return new HpPotion();
	}

}

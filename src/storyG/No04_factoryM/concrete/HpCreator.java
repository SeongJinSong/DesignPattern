package storyG.No04_factoryM.concrete;

import java.util.Date;

import storyG.No04_factoryM.framework.Item;
import storyG.No04_factoryM.framework.ItemCreator;

public class HpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		// TODO Auto-generated method stub
		System.out.println("�����ͺ��̽����� ü�� ȸ�� ������ ������ �����ɴϴ�.");
	}

	@Override
	protected void createItemLog() {
		// TODO Auto-generated method stub
		System.out.println("ü�� ȸ�� ������ ���� �����߽��ϴ�."+new Date());
	}

	@Override
	protected Item createItem() {
		// TODO Auto-generated method stub
		return new HpPotion();
	}

}

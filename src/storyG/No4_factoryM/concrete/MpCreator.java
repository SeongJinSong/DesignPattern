package storyG.No4_factoryM.concrete;

import java.util.Date;

import storyG.No4_factoryM.framework.Item;
import storyG.No4_factoryM.framework.ItemCreator;

public class MpCreator  extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		// TODO Auto-generated method stub
		System.out.println("�����ͺ��̽����� ���� ȸ�� ������ ������ �����ɴϴ�.");
		System.out.println("������ ���̽��� �� ����"); 
		//������ ���� �и���  --> main�Լ� ���� �ʿ����
	}

	@Override
	protected void createItemLog() {
		// TODO Auto-generated method stub
		System.out.println("���� ȸ�� ������ ���� �����߽��ϴ�."+new Date());
	}

	@Override
	protected Item createItem() {
		// TODO Auto-generated method stub
		return new MpPotion();
	}

}
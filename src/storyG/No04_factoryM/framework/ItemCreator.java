package storyG.No04_factoryM.framework;

public abstract class ItemCreator {
	//���丮 �޼ҵ� -> ���ø� �޼ҵ�� ����
	public Item create() {
		Item item;
		
		//step 1
		requestItemsInfo();
		//step 2
		item = createItem();
		//step3
		createItemLog();
		
		return item;
	}
	
	// �������� �����ϱ� ���� �����ͺ��̽����� ������������ ��û�մϴ�.
	abstract protected void requestItemsInfo();
	// �������� ���� �� ������ ���� ���� �ҹ��� �����ϱ� ����  ������ ���̽��� ������ ���� ������ ����ϴ�.
	abstract protected void createItemLog();
	//�������� �����ϴ� �˰���
	abstract protected Item createItem();
}

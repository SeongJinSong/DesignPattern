package storyG.No11_decorator;

/* �������� ��� �ν��Ͻ� �� �����Ǹ�, å���� �߰��Ǵ� �κ�*/
public class Milk extends AbstAdding {

	public Milk(IBeverage meterial) {
		super(meterial);
	}
	public int getTotalPrice() {
		return super.getTotalPrice()+50;
	}
}

package storyG.Nu11_decorator;

/* ���ڷ����� */
public class AbstAdding implements IBeverage {
	private IBeverage base;
	
	public AbstAdding(IBeverage base) {
		super();
		this.base = base;
	}

	@Override
	public int getTotalPrice() {
		// TODO Auto-generated method stub
		return base.getTotalPrice();
	}
	public IBeverage getBase() {
		return base;
	}
}

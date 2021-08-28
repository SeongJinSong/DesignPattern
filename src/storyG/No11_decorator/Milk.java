package storyG.No11_decorator;

/* 실질적인 장식 인스턴스 및 정의의며, 책임이 추가되는 부분*/
public class Milk extends AbstAdding {

	public Milk(IBeverage meterial) {
		super(meterial);
	}
	public int getTotalPrice() {
		return super.getTotalPrice()+50;
	}
}

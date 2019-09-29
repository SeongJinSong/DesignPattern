package storyG.decorator;

/* 실질적인 장식 인스턴스 및 정의의며, 책임이 추가되는 부분*/
public class Espresso extends AbstAdding {
	
	/*왜 static으로 했을까?*/
	static protected int espressoCount = 0;
	
	public Espresso(IBeverage base) {
		super(base);
	}
	
	public int getTotalPrice() {
		return super.getTotalPrice()+getAddPrice();
	}
	
	/* 에스프레스 추가가격 */
	private static int getAddPrice() {
		espressoCount+=1;
		int addPrice = 100;
		if(espressoCount>1) {
			addPrice = 70;
		}
		return addPrice;
	}

	
	
	
	
}

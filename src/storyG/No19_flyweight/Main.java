package storyG.No19_flyweight;

public class Main {
	/*
	 * 플라이웨이트 패턴을 통해 메모리 공간을 절약 할 수 있다.
	 * 
	 * 자주 사용하는 객체를 pool에 담았다가 재사용
	 */
	public static void main(String[] args) {
		FlyWeightFactory factory = new FlyWeightFactory();
		
		FlyWeight flyWeight = factory.getFlyweight("A");
		
		System.out.println(flyWeight);
		
		flyWeight = factory.getFlyweight("A");
		System.out.println(flyWeight);
		
		flyWeight = factory.getFlyweight("B");
		System.out.println(flyWeight);
		
		flyWeight = factory.getFlyweight("B");
		System.out.println(flyWeight);
	}
}
 
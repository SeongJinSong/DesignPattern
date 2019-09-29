package storyG.No6_prototype;

public class Main {
	/* Prototype Pattern
	 * 생산 비용이 높ㅇ츤 인스턴스를 복사를 통해서 쉽게 생성 할 수 있도록 하는 패턴 
	 * 
	 * 생산 비용이 높은 경우
	 * 1. 종류가 너무 많아서 클래스로 정리되지 않는 경우
	 * 2. 클래스로부터 인스턴스 생성이 어려운 경우
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle1 = new Circle(1, 1, 3);
		Circle circle2 = circle1.copy();
		
		System.out.println(circle1.getX()+","+circle1.getY()+","+circle1.getR());
		System.out.println(circle2.getX()+","+circle2.getY()+","+circle2.getR());
		
	}
}

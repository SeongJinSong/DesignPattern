package storyG.No6_prototype;

public class Main {
	/* Prototype Pattern
	 * ���� ����� ������ �ν��Ͻ��� ���縦 ���ؼ� ���� ���� �� �� �ֵ��� �ϴ� ���� 
	 * 
	 * ���� ����� ���� ���
	 * 1. ������ �ʹ� ���Ƽ� Ŭ������ �������� �ʴ� ���
	 * 2. Ŭ�����κ��� �ν��Ͻ� ������ ����� ���
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle1 = new Circle(1, 1, 3);
		Circle circle2 = circle1.copy();
		
		System.out.println(circle1.getX()+","+circle1.getY()+","+circle1.getR());
		System.out.println(circle2.getX()+","+circle2.getY()+","+circle2.getR());
		
	}
}

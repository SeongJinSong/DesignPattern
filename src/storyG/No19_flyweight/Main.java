package storyG.No19_flyweight;

public class Main {
	/*
	 * �ö��̿���Ʈ ������ ���� �޸� ������ ���� �� �� �ִ�.
	 * 
	 * ���� ����ϴ� ��ü�� pool�� ��Ҵٰ� ����
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
 
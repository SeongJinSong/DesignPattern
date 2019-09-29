package storyG.builder;

public class Main {
	/* Buulder Pattern
	 * ������ �ܰ踦 ���ľ� �����Ǵ� ��ü�� ������ ���� Ŭ�������� �Ѱ��ִ� ����
	 */
	public static void main(String[] args) {
		//Computer computer = new Computer("i7", "16g", "256g ssd");
		//System.out.println(computer.toString());
		
		ComputerFactory factory = new ComputerFactory();
		factory.setBluePrint(new LgGramBluePrint());
		factory.make();
		Computer computer = factory.getComputer();
		System.out.println(computer.toString());
	}
}

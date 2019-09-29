package storyG.builder;

public class Main {
	/* Buulder Pattern
	 * 복잡한 단계를 거쳐야 생성되는 객체의 구현을 서브 클래스에게 넘겨주는 패턴
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

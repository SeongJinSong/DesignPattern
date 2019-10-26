package storyG.No07_builder.ex2;

public class Main {
	public static void main(String[] args) {
		//Computer computer = new Computer("default", "default","default");
		
		Computer computer = ComputerBuilder
				.start()
				.setCpu("i7")
				.setRam("8g")
				.build();
		System.out.println(computer.toString());
		
		Computer computer2 = ComputerBuilder
				.startWithCpu("i9")
				.setRam("16g")
				.setStorage("ssd 256g")
				.build();
		System.out.println(computer2.toString());
	}
	
}

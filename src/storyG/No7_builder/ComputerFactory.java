package storyG.No7_builder;

public class ComputerFactory {
	private BluePrint bluePrint;

	public BluePrint getBluePrint() {
		return bluePrint;
	}

	public void setBluePrint(BluePrint bluePrint) {
		this.bluePrint = bluePrint;
	}
	
	public void make() {
		bluePrint.setCpu();
		bluePrint.setRam();
		bluePrint.setStorage();
	}
	
	public Computer getComputer() {
		return bluePrint.getComputer();
	}

}

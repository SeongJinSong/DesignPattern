package storyG.Bridge.pattern;

public class soundMCF  implements MorseCodeFunction {
	@Override
	public void dot() {
		System.out.print("��~");
	}
	@Override
	public void dash() {
		System.out.print("������~");
	}
	@Override
	public void space() {
		System.out.print(" ");
	}

}
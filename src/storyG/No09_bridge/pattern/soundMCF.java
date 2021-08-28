package storyG.No09_bridge.pattern;

public class soundMCF  implements MorseCodeFunction {
	@Override
	public void dot() {
		System.out.print("삣~");
	}
	@Override
	public void dash() {
		System.out.print("디이이~");
	}
	@Override
	public void space() {
		System.out.print(" ");
	}

}
package storyG.No9_Bridge.pattern;

public class soundMCF  implements MorseCodeFunction {
	@Override
	public void dot() {
		System.out.print("ªÂ~");
	}
	@Override
	public void dash() {
		System.out.print("µ¿Ã¿Ã~");
	}
	@Override
	public void space() {
		System.out.print(" ");
	}

}
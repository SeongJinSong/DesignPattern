package storyG.No9_Bridge.pattern;

public class Main {
	public static void main(String[] args) {
		PrintMorseCode code = new PrintMorseCode(new DefaultMCF());
		code._g()._a()._r()._a()._m();
		System.out.println();
		PrintMorseCode code2 = new PrintMorseCode(new soundMCF());
		code2._g()._a()._r()._a()._m();
		System.out.println();
		PrintMorseCode code3 = new PrintMorseCode(new flashMCF());
		code3._g()._a()._r()._a()._m();
	}
}

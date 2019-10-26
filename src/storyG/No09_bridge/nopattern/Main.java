package storyG.No09_bridge.nopattern;

public class Main {
	public static void main(String[] args) {
		PrintMorseCode code = new PrintMorseCode();
		code.g();code.a();code.r();code.a();code.m();
		System.out.println("\nUse Builder Pattern");
		code._g()._a()._r()._a()._m();
	}
}

package storyG.Bridge.pattern;

public class PrintMorseCode extends MorseCode {
	public PrintMorseCode(MorseCodeFunction function) {
		super(function);
	}
	public void g() {
		dash();dash();dot();space();
	}
	public void a() {
		dot();dash();space();
	}
	public void r() {
		dot();dash();dot();space();
	}
	public void m() {
		dash();dash();space();
	}
	
	public PrintMorseCode _g() {
		dash();dash();dot();space();
		return this;
	}
	public PrintMorseCode _a() {
		dot();dash();space();
		return this;
	}
	public PrintMorseCode _r() {
		dot();dash();dot();space();
		return this;
	}
	public PrintMorseCode _m() {
		dash();dash();space();
		return this;
	}
}

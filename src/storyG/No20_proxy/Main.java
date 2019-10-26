package storyG.No20_proxy;

public class Main {
	/*
	 * 대리인
	 * 프록시 패턴을 통해 작업을 나눠서 구현할 수 있다.
	 */
	public static void main(String[] args) {
		Subject real = new RealSubject();
		
		Subject proxy1 = new Proxy(real);
		
		Subject proxy2 = new Proxy(real);
		
		proxy1.action1();
		proxy2.action1();
		
		proxy1.action2();
		proxy2.action2();
	}
}

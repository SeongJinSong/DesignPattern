package storyG.No17_state;

public class Main {
	/*
	 * 상태 패턴을 통해 상태를 객체로 나타내고 행동을 구현한다.
	 * 객체, 상태, 행동
	 * 
	 * 전략패턴과 비슷한 구조지만, 상태에 따라서 동작이 다르고 동작이 상태에 영향을 받는다는 사실이 다르다.
	 */
	public static void main(String[] args) {
		Light light = new Light();
		
		light.off();
		light.off();
		light.off();
		
		light.on();
		light.on();
		light.on();
		
		light.off();
		light.on();
		light.off();
		light.on();
		light.off();
		light.on();
		
	}
}

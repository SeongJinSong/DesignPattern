package storyG.No17_state;

public class Main {
	/*
	 * ���� ������ ���� ���¸� ��ü�� ��Ÿ���� �ൿ�� �����Ѵ�.
	 * ��ü, ����, �ൿ
	 * 
	 * �������ϰ� ����� ��������, ���¿� ���� ������ �ٸ��� ������ ���¿� ������ �޴´ٴ� ����� �ٸ���.
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

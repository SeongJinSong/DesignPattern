package storyG.No05_singleton;

public class Main {
	/* ��ü
	 * �Ӽ��� ����� ���� �� 
	 */
	/* Ŭ����
	 * �Ӽ��� ����� ������ ��
	 */
	/* �ν��Ͻ�
	 * �Ӽ��� ����� ���� �� �� ����  �ϴ� ��
	 */
	
	/* �̱���
	 * �ϳ��� ���� �ؾ��� ��ü�� ���� ����
	 * �ν��Ͻ��� �����Ѵ�.
	 */
	
	public static void main(String[] args) {
		SystemSpeaker speaker1 = SystemSpeaker.getInstance();
		SystemSpeaker speaker2 = SystemSpeaker.getInstance();
		
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		speaker1.setVolume(22);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
	}
}
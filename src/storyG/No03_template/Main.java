package storyG.No03_template;

import storyG.No03_template.game.AbstGameConnectHelper;
import storyG.No03_template.game.DefaultGameConnectHelper;

public class Main {
	public static void main(String[] args) {
		/* ���ø� �޼ҵ� ����
		 * 
		 * �˰����� ������ �޼ҵ忡 �����ϰ�
		 * ����Ŭ�������� �˰��� ������ ������� �˰����� �������ϴ� ����
		 */
		
		/* ����ϱ� ������ ��Ȳ
		 * 
		 * �����Ϸ��� �˰����� ������ ���μ����� �ִ�.
		 * �����Ϸ��� �˰����� ���氡�ɼ��� �ִ�.
		 */
		
		/* ����ϴ� �ܰ�
		 * 
		 * �˰����� ���� �ܰ�� ������.
		 * ������ �˰����� �ܰ踦 �޼ҵ�� �����Ѵ�.
		 * �˰����� ������ ���ø� �޼ҵ带 �����.
		 * ����Ŭ�������� ������ �޼ҵ���� �����Ѵ�.
		 */
		
		AbstGameConnectHelper helper = new DefaultGameConnectHelper();
		//������ ��Ű���� �ƴϸ� protected�� ���ٵ��� �ʴ´�.
		helper.requestConnection("���̵� ��ȣ �� ��������");
	}
}

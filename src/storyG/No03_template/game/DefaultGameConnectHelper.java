package storyG.No03_template.game;

public class DefaultGameConnectHelper extends AbstGameConnectHelper {

	@Override
	protected String doSecurity(String string) {
		System.out.println("���ڵ�");
		return null;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("���̵�/��ȣ Ȯ�� ����");
		return false;
	}

	@Override
	protected int autorization(String userName) {
		System.out.println("���� Ȯ��");
		// �������� �����̸� ���� ���̸� �� �� �ִ�.
		// ���̸� Ȯ���ϰ� �ð��� Ȯ���ϰ� ������ �ƴϰ� 10�ð� �����ٸ�
		// ������ ���� ������ �Ѵ�.
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("������ ���� �ܰ�!");
		return null;
	}

}

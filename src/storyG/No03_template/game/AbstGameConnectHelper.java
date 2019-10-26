package storyG.No03_template.game;

public abstract class AbstGameConnectHelper {
	protected abstract String doSecurity(String string);
	protected abstract boolean authentication(String id, String password);
	protected abstract int autorization(String userName);
	protected abstract String connection(String info);
	
	//���ø� �޼ҵ�
	public String requestConnection(String encodedInfo) {
		//���Ȱ��� -> ��ȣȭ �� ���ڿ��� ��ȣȭ
		String decodedInfo = doSecurity(encodedInfo);
		//��ȯ�� ���� ������ ���̵�, ��ȣ�� �Ҵ��Ѵ�.
		String id = "id";
		String password ="pw";
		//�������� -> ID�� PW Ȯ��
		if(!authentication(id, password)) {
			throw new Error("���̵� ��ȣ ����ġ");
		}
		
		String userName = "userNm";
		//����
		int i = autorization(userName);
		switch(i) {
		case -1:
			throw new Error("�˴ٿ�");
		case 0: // ���� �Ŵ���
			break;
		case 1: // ���� ȸ��
			break;
		case 2: // ���� ȸ��
			break;
		case 3: // ���� ����
			break;
		default: // ��Ÿ ��Ȳ
			break;
		}
		return connection(decodedInfo);
	}
	
}

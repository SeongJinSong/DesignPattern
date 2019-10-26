package storyG.No16_mediator.mediator;

import storyG.No16_mediator.contract.Colleague;
import storyG.No16_mediator.contract.Mediator;

public class ChatMediator extends Mediator{
	@Override
	public void mediate(String data) {
		// TODO Auto-generated method stub
		for(Colleague colleague : colleagues) {
			//���� ���ɼ� �ִ� ����
			//�Ӹ� ��
			colleague.handle(data);
		}
	}
}

package storyG.No16_mediator;

import storyG.No16_mediator.contract.Colleague;
import storyG.No16_mediator.contract.Mediator;
import storyG.No16_mediator.mediator.ChatColleague;
import storyG.No16_mediator.mediator.ChatMediator;

public class Main {
	/*
	 * 미디에이터 패턴을 통해 복잡한 관계를 간단한 관계로 구현한다.
	 */
	public static void main(String[] args) {
		Mediator mediator = new ChatMediator();
		
		Colleague colleague1 = new ChatColleague();
		Colleague colleague2 = new ChatColleague();
		Colleague colleague3 = new ChatColleague();
		
		colleague1.join(mediator);
		colleague2.join(mediator);
		colleague3.join(mediator);
		
		colleague1.sendData("AAA");
		colleague2.sendData("BBB");
		colleague3.sendData("CCC");
	}
}

package storyG.No16_mediator.mediator;

import storyG.No16_mediator.contract.Colleague;

public class ChatColleague extends Colleague{
	@Override
	public void handle(String data) {
		// TODO Auto-generated method stub
		System.out.println(this+"-"+data);
	}
}

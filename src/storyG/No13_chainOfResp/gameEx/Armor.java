package storyG.No13_chainOfResp.gameEx;

public class Armor implements Defense {
	
	private Defense nextDefense;
	private int def;
	public Armor(int def) {
		this.def = def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	@Override
	public void defense(Attack attack) {
		
		/*  포인트
		 *  1. 하나의 객체만 책임을 지지 않아도 된다.
		 *  2. 
		 */
		process(attack);
		
		if(nextDefense != null) {
			nextDefense.defense(attack);
		}
	}
	private void process(Attack attack) {
		int amount = attack.getAmount();
		amount -=def;
		attack.setAmount(amount);
	}
	public void setNextDefense(Defense nextDefense) {
		this.nextDefense = nextDefense;
	}
}

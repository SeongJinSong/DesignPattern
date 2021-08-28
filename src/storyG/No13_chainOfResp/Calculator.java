package storyG.No13_chainOfResp;

public abstract class Calculator {
	private Calculator nextCalculator; //자신이 먼저 처리
	private Calculator preCalculator; //다른게 먼저 처리
	
	public void setNextCalculator(Calculator nextCalculator) {
		this.nextCalculator = nextCalculator;
	}
	public void setPreCalculator(Calculator preCalculator) {
		this.preCalculator = nextCalculator;
	}
	public boolean process(Request request) {
		if(operator(request)) {
			return true;
		}
		else {
			if(nextCalculator !=null)
				return nextCalculator.process(request);
			else
				return false;
		}
	}
	public boolean preProcess(Request request) {
		if(preCalculator != null) 
			if(preCalculator.preProcess(request))
				return true;
		return operator(request);	
	}
	abstract protected boolean operator(Request request);
}

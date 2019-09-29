package storyG.No13_chainOfResp;

public class Main {
	public static void main(String[] args) {
		Calculator plus = new PlusCalCulator();
		Calculator sub = new SubCalCulator();
		
		Request request1 = new Request(1,2,"+");
		Request request2 = new Request(10,2,"-");
		
		plus.setNextCalculator(sub);
		plus.process(request1);
		plus.process(request2);
		
		plus.setPreCalculator(sub);
		plus.preProcess(request1);
		plus.preProcess(request2);
		
	}
}

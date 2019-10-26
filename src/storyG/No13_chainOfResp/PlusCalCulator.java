package storyG.No13_chainOfResp;

public class PlusCalCulator  extends Calculator {

	@Override
	protected boolean operator(Request request) {
		if(request.getOperator().equals("+")) {
			int a = request.getA();
			int b = request.getB();
			int res = a+b;
			System.out.println(a+"+"+b+"="+res);
		}
		return false;
	}

}

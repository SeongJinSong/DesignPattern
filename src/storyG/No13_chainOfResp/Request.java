package storyG.No13_chainOfResp;

public class Request {
	int a,b;
	String operator;
	public Request(int a, int b, String operator) {
		super();
		this.a = a;
		this.b = b;
		this.operator = operator;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
}

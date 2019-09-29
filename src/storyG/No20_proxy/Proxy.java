package storyG.No20_proxy;

public class Proxy implements Subject{
	
	private Subject real;
	
	public Proxy(Subject real) {
		// TODO Auto-generated constructor stub
		this.real = real;
	}
	
	@Override
	public void action1() {
		// TODO Auto-generated method stub
		System.out.println("������ ���� by Proxy");
	}
	@Override
	public void action2() {
		// TODO Auto-generated method stub
		this.real.action2();
	}
}

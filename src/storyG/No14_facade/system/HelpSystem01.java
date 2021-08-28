package storyG.No14_facade.system;

/*디폴트 제한이 되어서 같은 패키지만 접근 가능하게 된다.*/
class HelpSystem01 {
	public HelpSystem01() {
		System.out.println("Call Constructor : "+getClass().getSimpleName());
	}
	public void process() {
		System.out.println("Call Process : "+getClass().getSimpleName());
	}
}

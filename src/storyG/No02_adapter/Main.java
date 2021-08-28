package storyG.No02_adapter;

public class Main {
	public static void main(String[] args) {
		Adapter adapter = new AdapterImpl();
		//수정사항이 있으면 adapterImpl에서 변경한다.
		System.out.println(adapter.twiceOf(100f));
		System.out.println(adapter.halfOf(100f));
	}
}

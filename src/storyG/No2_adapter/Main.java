package storyG.No2_adapter;

public class Main {
	public static void main(String[] args) {
		Adapter adapter = new AdapterImpl();
		//���������� ������ adapterImpl���� �����Ѵ�.
		System.out.println(adapter.twiceOf(100f));
		System.out.println(adapter.halfOf(100f));
	}
}
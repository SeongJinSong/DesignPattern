package storyG.No02_adapter;

public class AdapterImpl implements Adapter {

	@Override
	public Float twiceOf(Float f) {
		//���� �˰���
		//return (float)Math.towTime(f);
		
		//��ȭ�� �˰���
		return Math.doubled(f.doubleValue()).floatValue();
	}

	@Override
	public Float halfOf(Float f) {
		System.out.println("�����Լ�ȣ��");
		//main�Լ��� ���̺귯���� �������� �ʰ� �α׻����� �� �� �ִ�.
		return (float)Math.half(f);
	}

}

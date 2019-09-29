package storyG.No02_adapter;

public class AdapterImpl implements Adapter {

	@Override
	public Float twiceOf(Float f) {
		//기존 알고리즘
		//return (float)Math.towTime(f);
		
		//강화된 알고리즘
		return Math.doubled(f.doubleValue()).floatValue();
	}

	@Override
	public Float halfOf(Float f) {
		System.out.println("절반함수호출");
		//main함수와 라이브러리를 수정하지 않고 로그삽일을 할 수 있다.
		return (float)Math.half(f);
	}

}

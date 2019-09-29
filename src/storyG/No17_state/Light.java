package storyG.No17_state;

public class Light {
	protected LightState lightState;
	private LightState offState = new LightState() {
		@Override
		public void on() {
			// TODO Auto-generated method stub
			System.out.println("Light ON");
			lightState = onState;
		}@Override
		public void off() {
			// TODO Auto-generated method stub
			System.out.println("Nothing");
		}
	};
	private LightState onState = new LightState() {
		@Override
		public void on() {
			// TODO Auto-generated method stub
			System.out.println("Nothing");
		}@Override
		public void off() {
			// TODO Auto-generated method stub
			System.out.println("Light OFF");
			lightState = offState;
		}
	};
	public void on() {
		lightState.on();
	}
	public void off() {
		lightState.off();
	}
	public Light() {
		lightState = offState;
	}
}

interface LightState{
	void on();
	void off();
}
package storyG.No8_absFactory.absFactory1.gt;

import storyG.No8_absFactory.absFactory1.abst.*;

public class GtFactory implements BikeFactory{

	@Override
	public Body createBody() {
		// TODO Auto-generated method stub
		return new GtBody();
	}

	@Override
	public Wheel createWheel() {
		// TODO Auto-generated method stub
		return new GtWheel();
	}

}

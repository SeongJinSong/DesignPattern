package storyG.absFactory.gt;

import storyG.absFactory.abst.BikeFactory;
import storyG.absFactory.abst.Body;
import storyG.absFactory.abst.Wheel;

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

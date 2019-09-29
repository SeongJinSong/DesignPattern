package storyG.absFactory.sam;

import storyG.absFactory.abst.BikeFactory;
import storyG.absFactory.abst.Body;
import storyG.absFactory.abst.Wheel;

public class SamFactory implements BikeFactory {

	@Override
	public Body createBody() {
		// TODO Auto-generated method stub
		return new SamBody();
	}

	@Override
	public Wheel createWheel() {
		// TODO Auto-generated method stub
		return new SamWheel();
	}

}

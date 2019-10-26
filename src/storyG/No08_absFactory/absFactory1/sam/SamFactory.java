package storyG.No08_absFactory.absFactory1.sam;

import storyG.No08_absFactory.absFactory1.abst.BikeFactory;
import storyG.No08_absFactory.absFactory1.abst.Body;
import storyG.No08_absFactory.absFactory1.abst.Wheel;

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

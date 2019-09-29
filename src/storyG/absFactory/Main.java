package storyG.absFactory;

import storyG.absFactory.abst.BikeFactory;
import storyG.absFactory.abst.Body;
import storyG.absFactory.abst.Wheel;
import storyG.absFactory.sam.SamFactory;

public class Main {
	/* 
	 * 
	 */
	public static void main(String[] args) {
		BikeFactory factory = new SamFactory();
		Body body = factory.createBody();
		Wheel wheel = factory.createWheel();
		
		System.out.println(body.getClass());
		System.out.println(wheel.getClass());
	}
	
}

package storyG.No8_absFactory.absFactory1;

import storyG.No8_absFactory.absFactory1.abst.BikeFactory;
import storyG.No8_absFactory.absFactory1.abst.Body;
import storyG.No8_absFactory.absFactory1.abst.Wheel;
import storyG.No8_absFactory.absFactory1.sam.SamFactory;

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

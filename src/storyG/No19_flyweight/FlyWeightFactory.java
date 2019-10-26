package storyG.No19_flyweight;

import java.util.Map;
import java.util.TreeMap;

public class FlyWeightFactory {
	Map<String, FlyWeight> pool;
	
	public FlyWeightFactory() {
		pool = new TreeMap<>();
	}
	
	public FlyWeight getFlyweight(String key) {
		FlyWeight flyWeight = pool.get(key);
		
		if(flyWeight == null) {
			flyWeight = new FlyWeight(key);
			
			pool.put(key, flyWeight);
			System.out.println("새로 생성 " + key);
		}
		else {
			System.out.println("재사용 " + key);
		}
		return flyWeight;
	}
}

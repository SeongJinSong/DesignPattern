package storyG.factoryM;

import storyG.factoryM.concrete.HpCreator;
import storyG.factoryM.concrete.MpCreator;
import storyG.factoryM.framework.Item;
import storyG.factoryM.framework.ItemCreator;

public class Main {
	public static void main(String[] args) {
		ItemCreator creator;
		Item item;
		
		creator = new HpCreator();
		item = creator.create();
		item.use();
		
		creator = new MpCreator();
		item = creator.create();
		item.use();
	}
}

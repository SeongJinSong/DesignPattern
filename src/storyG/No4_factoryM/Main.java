package storyG.No4_factoryM;

import storyG.No4_factoryM.concrete.HpCreator;
import storyG.No4_factoryM.concrete.MpCreator;
import storyG.No4_factoryM.framework.Item;
import storyG.No4_factoryM.framework.ItemCreator;

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

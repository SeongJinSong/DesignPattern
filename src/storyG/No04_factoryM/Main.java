package storyG.No04_factoryM;

import storyG.No04_factoryM.concrete.HpCreator;
import storyG.No04_factoryM.concrete.MpCreator;
import storyG.No04_factoryM.framework.Item;
import storyG.No04_factoryM.framework.ItemCreator;

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

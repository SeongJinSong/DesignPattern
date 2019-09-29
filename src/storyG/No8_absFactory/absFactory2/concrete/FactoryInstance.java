package storyG.No8_absFactory.absFactory2.concrete;

import storyG.No8_absFactory.absFactory2.abst.GuiFac;
import storyG.No8_absFactory.absFactory2.linux.LinuxGuiFactory;
import storyG.No8_absFactory.absFactory2.mac.MacGuiFactory;
import storyG.No8_absFactory.absFactory2.win.WinGuiFactory;

public class FactoryInstance {
	public static GuiFac getGuiFac() {
		switch(getOsCode()) {
		case 0:
			return new MacGuiFactory();
		case 1:
			return new LinuxGuiFactory();
		case 2:
			return new WinGuiFactory();
		}
		return null;
	}
	private static int getOsCode(){
		String os = System.getProperty("os.name").split(" ")[0];
		switch(os)
		{
		case "Mac":
			return 0;
		case "Linux":
			return 1;
		case "Windows":
			return 2;
		}
		return -1;
	}
}

package storyG.No21_command;

public class StringPrintCommand implements Command {
	
	protected String string;
	
	public StringPrintCommand(String string) {
		// TODO Auto-generated constructor stub
		this.string = string;
	}

	@Override
	public int compareTo(Command o) {
		StringPrintCommand other = (StringPrintCommand) o;
		int ret = this.string.length() - other.string.length();
		return ret;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println(this.string);
	}

}

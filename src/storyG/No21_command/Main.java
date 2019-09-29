package storyG.No21_command;

import java.util.LinkedList;
import java.util.List;

public class Main {
	/*
	 * ��ɰ� ��üȭ �Ǿ��� ������ �پ��� ���� ���� �� �ִٴ� ������ �ִ�.
	 */
	public static void main(String[] args) {
		List<Command> list = new LinkedList<>();
		
		list.add(new Command() {
			
			@Override
			public void execute() {
				System.out.println("�۾� 1");
			}
			@Override
			public int compareTo(Command var1) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		
		list.add(new Command() {
			
			@Override
			public void execute() {
				System.out.println("�۾� 2");
			}
			@Override
			public int compareTo(Command var1) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		
		list.add(new Command() {
			
			@Override
			public void execute() {
				System.out.println("�۾� 3");
			}
			@Override
			public int compareTo(Command var1) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		
		for(Command command : list) {
			command.execute();
		}
		
	}
}

package storyG.No21_command;

import java.util.LinkedList;
import java.util.List;

public class Main {
	/*
	 * 명령과 객체화 되었기 때문에 다양한 모델을 만들 수 있다는 장점이 있다.
	 */
	public static void main(String[] args) {
		List<Command> list = new LinkedList<>();
		
		list.add(new Command() {
			
			@Override
			public void execute() {
				System.out.println("작업 1");
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
				System.out.println("작업 2");
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
				System.out.println("작업 3");
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

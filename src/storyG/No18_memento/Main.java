package storyG.No18_memento;

import java.util.Stack;

import storyG.No18_memento.org.Memento;
import storyG.No18_memento.org.Originator;

public class Main {
	/*
	 * ���� : ���ǰ, ��ǰ, �߾�Ÿ�
	 * �н� ��ǥ
	 * - �޸��� ������ ���� ��ü�� ���¸� �����ϰ� �������·� �����Ѵ�.
	 * - ���������� protected�� ����� �����Ѵ�.
	 */
	public static void main(String[] args) {
		//Care Taker
		Stack<Memento> mementos = new Stack<>();
		
		Originator originator = new Originator();
		
		originator.setState("state 1");
		mementos.push(originator.createMemento());
		
		//protected�� �ڱⰡ ��ӹ��� ��ü Ȥ�� ���� ��Ű�� �������� ������ �����ϴ�.
		//Memento memento = new Memento("state something");
		//mementos.push(memento);
		
		originator.setState("state 2");
		mementos.push(originator.createMemento());
		originator.setState("state 3");
		mementos.push(originator.createMemento());
		originator.setState("state Final");
		mementos.push(originator.createMemento());
		
		originator.restoreMemento(mementos.pop());
		System.out.println(originator.getState());
		originator.restoreMemento(mementos.pop());
		System.out.println(originator.getState());
		originator.restoreMemento(mementos.pop());
		System.out.println(originator.getState());
		originator.restoreMemento(mementos.pop());
		System.out.println(originator.getState());
		
	}
}

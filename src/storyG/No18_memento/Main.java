package storyG.No18_memento;

import java.util.Stack;

import storyG.No18_memento.org.Memento;
import storyG.No18_memento.org.Originator;

public class Main {
	/*
	 * 정의 : 기념품, 유품, 추억거리
	 * 학습 목표
	 * - 메멘토 패턴을 통해 객체의 상태를 저장하고 이전상태로 복구한다.
	 * - 접근제한자 protected의 사용을 이해한다.
	 */
	public static void main(String[] args) {
		//Care Taker
		Stack<Memento> mementos = new Stack<>();
		
		Originator originator = new Originator();
		
		originator.setState("state 1");
		mementos.push(originator.createMemento());
		
		//protected는 자기가 상속받을 객체 혹은 같은 패키지 내에서만 접근이 가능하다.
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

package storyG.No12_visitor;

import java.util.ArrayList;

public class Main {
	/*
	 * 방문자 패턴을 이용하여 객체에서 처리를 분리해서 사용할 수 있다.
	 * 객체(class), 처리(method), 분리
	 */
	public static void main(String[] args) {
		ArrayList<Visitable> visitables = new ArrayList<>();
		
		visitables.add(new VisitableA(1));
		visitables.add(new VisitableA(2));
		visitables.add(new VisitableA(3));
		visitables.add(new VisitableA(4));
		visitables.add(new VisitableA(5));
		
		Visitor visitor = new VisitorA();
		for(Visitable visitable : visitables) {
			visitable.accept(visitor);
		}
		System.out.println(((VisitorA)visitor).getAgeSum());
	}
}

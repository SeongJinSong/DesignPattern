package storyG.No03_template;

import storyG.No03_template.game.AbstGameConnectHelper;
import storyG.No03_template.game.DefaultGameConnectHelper;

public class Main {
	public static void main(String[] args) {
		/* 템플릿 메소드 패턴
		 * 
		 * 알고리즘의 구조를 메소드에 정의하고
		 * 하위클래스에서 알고리즘 구조의 변경없이 알고리즘을 재정의하는 패턴
		 */
		
		/* 사용하기 적합한 상황
		 * 
		 * 구현하려는 알고리즘이 일정한 프로세스가 있다.
		 * 구현하려는 알고리즘이 변경가능성이 있다.
		 */
		
		/* 사용하는 단계
		 * 
		 * 알고리즘을 여러 단계로 나눈다.
		 * 나눠진 알고리즘의 단계를 메소드로 선언한다.
		 * 알고리즘을 수행할 템플릿 메소드를 만든다.
		 * 하위클래스에서 나눠진 메소드들을 구현한다.
		 */
		
		AbstGameConnectHelper helper = new DefaultGameConnectHelper();
		//동일한 패키지가 아니면 protected가 접근되지 않는다.
		helper.requestConnection("아이디 암호 등 접속정보");
	}
}

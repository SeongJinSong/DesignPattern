package storyG.No05_singleton;

public class Main {
	/* 객체
	 * 속성과 기능을 갖춘 것 
	 */
	/* 클래스
	 * 속성과 기능을 정의한 것
	 */
	/* 인스턴스
	 * 속성과 기능을 가진 것 중 실제  하는 것
	 */
	
	/* 싱글톤
	 * 하나만 생성 해야할 객체를 위한 패턴
	 * 인스턴스를 생성한다.
	 */
	
	public static void main(String[] args) {
		SystemSpeaker speaker1 = SystemSpeaker.getInstance();
		SystemSpeaker speaker2 = SystemSpeaker.getInstance();
		
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		speaker1.setVolume(22);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
	}
}

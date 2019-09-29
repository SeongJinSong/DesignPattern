package storyG.prototype.deepshallw;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Cat navi = new Cat();
		navi.setName("navi");
		navi.setAge(3);
		navi.setAgeInfo(new Age(2012, 3));
		
		//주소값을 복사하은 shallow copy
		Cat yo = navi;
		yo.setName("yo");
		yo.setAge(1);
		yo.setAgeInfo(new Age(2013, 2));
		
		Cat yo2 = navi.copy();
		yo2.setName("yo2");
		yo2.setAge(2);
		yo2.setAgeInfo(new Age(2014, 2));
		
		Cat yo3 = navi.copy(); // deap copy가 일어나지 않았다.
		//primitive type은 깊은복사를 지원해준다.
		//클래스는 직접 깊은 복사를 해주어아야 한다.
		yo3.setName("yo3");
		yo3.setAge(2);
		yo3.getAgeInfo().setYear(2015);
		
		System.out.println("navi :"	+ navi.getName());
		System.out.println("yo : "	+ yo.getName());
		System.out.println("yo2 : "	+ yo2.getName());
		System.out.println("-----------------------");
		System.out.println("navi :"	+ navi.getAge());
		System.out.println("yo : "	+ yo.getAge());
		System.out.println("yo2 : "	+ yo2.getAge());
		System.out.println("-----------------------");
		System.out.println("navi :"	+ navi.getAgeInfo().getYear());
		System.out.println("yo : "	+ yo.getAgeInfo().getYear());
		System.out.println("yo2 : "	+ yo2.getAgeInfo().getYear());
		System.out.println("yo3 : "	+ yo3.getAgeInfo().getYear());
	}
}

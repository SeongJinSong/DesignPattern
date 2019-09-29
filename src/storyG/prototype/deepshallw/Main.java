package storyG.prototype.deepshallw;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Cat navi = new Cat();
		navi.setName("navi");
		navi.setAge(3);
		navi.setAgeInfo(new Age(2012, 3));
		
		//�ּҰ��� �������� shallow copy
		Cat yo = navi;
		yo.setName("yo");
		yo.setAge(1);
		yo.setAgeInfo(new Age(2013, 2));
		
		Cat yo2 = navi.copy();
		yo2.setName("yo2");
		yo2.setAge(2);
		yo2.setAgeInfo(new Age(2014, 2));
		
		Cat yo3 = navi.copy(); // deap copy�� �Ͼ�� �ʾҴ�.
		//primitive type�� �������縦 �������ش�.
		//Ŭ������ ���� ���� ���縦 ���־�ƾ� �Ѵ�.
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

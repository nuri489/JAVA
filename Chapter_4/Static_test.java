package Chapter_4;

class Person{
	
	String name;
	int age = 10;
	final static String nation = "대한민국";
	
	static void showPerson()
	{
		System.out.println(name + " " + age + " " + nation);
	}
	
	static void showNation()
	{
		System.out.println(nation);
	}
	
}

public class Static_test {

	public static void main(String[] args) {
		
		
		System.out.println(Person.nation);
		Person.showNation();
		// static 변수는 Person p1 = new Person(); 를 하기도 전에 할당되므로 출력 가능함
		// 메소드도 마찬가지로 static 메소드를 구현하여 출력 가능
		
		
		Person p1 = new Person();
		
		p1.name = "김기로";
		p1.age = 27;
		
		System.out.println("p1의 국적은 " + Person.nation);
		
		Person p2 = new Person();
		
		p2.name = "김철수";
//		p2.nation = "미국?";
		
		// final 이 붙었으므로 수정 불가
		
		System.out.println("p2의 국적은 "+ p2.nation);
		
		// p1.nation 이 아니라 Person 클래스의 nation 변수 호출
		// age는 static 변수가 아니므로 호출 불가
		
		p1.showPerson();
		p1.showNation();
		

	}

}

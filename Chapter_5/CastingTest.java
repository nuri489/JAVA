package Chapter_5;

class Parent {
	
	int su = 10;
	int so = 30;
	void pr()
	{
		System.out.println(su);
	}
	
	void prr()
	{
	
	}
	
}

class Child1 extends Parent {
	
	int su =20;
	int si = 40;
	void por()
	{
		System.out.println(su);
	}
	
	void prr()
	{
		System.out.println(si);
	}

}



public class CastingTest {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		System.out.println(p.su);
		
		Child1 c1 = new Child1();
		System.out.println(c1.su);
		
		Parent c2 = new Child1();
		System.out.println(c2.su);
		
		
		// 10 , 20 , 10
		// Child1의 메소드를 Parent의 변수로 출력?
		
		System.out.println(c2.so);
		
		//30 , Child1 에 없는 so 변수를 출력
		
//		System.out.println(c2.si);
		
		// Child1에만 있는 si 변수 출력 불가
		
//		c2.por();
		
		// 마찬가지로 Child1에만 있는 por 메소드 출력 불가
		
		c2.prr();
		
		// child1 에서 오버라이딩 된 prr 메소드로 child1에만 있는 si 변수 출력은 됨.. ??
		
		

	}

}

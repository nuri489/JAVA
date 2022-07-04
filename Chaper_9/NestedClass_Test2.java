package Chaper_9;



class A {
	
	interface I {
		// I를 상속받은 무명의 클래스
	
		void m1();
		
	}

	I i1 = new I()
	{
		
		public void m1()
		{
			System.out.println("m1 메소드 호출");
		}
		
	};
	// 인터페이스 I를 상속받은 이름없는 클래스를 정의함
	// 동시에 그 이름없는 클래스의 객체를 생성함
	
	// 즉, 무명의 클래스를 만들고 imp I를 하고
	// 그 클래스 안에 m1 메소드를 오버라이딩 하는걸 한번에 해결함
	
	
	
	
	
}

public class NestedClass_Test2 {

	public static void main(String[] args) {
		
		A a1 = new A();
		a1.i1.m1();
		

	}

}

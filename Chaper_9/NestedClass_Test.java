package Chaper_99;

class Z {
	
	B b1 = new B();
	
	class B {
		int x =20;
		void Bmethod()
		{
			System.out.println(x);
		}
		
	}
	
	static class C {
		
		int y = 30;
		void Cmethod()
		{
			System.out.println(y);
		}
	}
	
	void Amethod()
	{
		B b2 = new B();
		b2.Bmethod();
	}
}

public class NestedClass_Test {

	public static void main(String[] args) {
		
		A a1 = new A();
		System.out.println(a1.b1.x);
		
		A.B b1 = a1.new B();
		System.out.println(b1.x);
		// A 안에 B의 객체 b2는 a1 안의 B 활용?
		
		
		A.B b = new A().new B();
		System.out.println(b.x);
		b.Bmethod();
		// A객체를 만들고 B 객체를 만듦
		// a1은 new A()와 같다.
		
		A.C c1 = new A.C();
		System.out.println(c1.y);
		c1.Cmethod();
		// static 클래스이므로 이미 C 객체 자체는 생성이 되어있음
		// 따라서 A의 객체만 만들고 만들어진 C 객체를 활용함
		
		a1.Amethod();
		
		
		
		

	}

}

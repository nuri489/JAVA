package Chapter_5;

class A {
	
	int i;
	A()
	{
		i = 100;
	}
}

class B extends A {
	
	int j;
	B()
	{
		j = 200;
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		

		B b1 = new B();
		// Object 객체 생성 -> A객체 생성 -> B객체 생성
		// super 클래스 ?
		System.out.println(b1.i);
		System.out.println(b1.j);
		
	}

}

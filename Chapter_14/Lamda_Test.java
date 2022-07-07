package Chapter_14;

@FunctionalInterface
interface I1 {
	
	void m1();
}

interface I2 {
	
	void m1(int x);
}

interface I3 {
	
	void m1(int x, int y);
}

interface I4 {
	
	int m1(int i, int j);
}

public class Lamda_Test {

	public static void main(String[] args) {
		
		I1 i1 = () -> System.out.println("람다람쥐");
		i1.m1();
		
		I2 i2 = x -> System.out.println(x);
		i2.m1(100);
		
		I3 i3 = (x,y) -> { System.out.println(x*y); System.out.println(x/y); };
		i3.m1(100, 5);
		// 인터페이스를 implements 하고 메소드를 오버라이딩하는 과정을 간략화 함
		// 매개변수가 하나라면 () 생략 가능
		// 오버라이딩 문장이 하나라면 {} 생략 가능
		
		I4 i4 = (i,j) ->  i+j;
		System.out.println(i4.m1(2,3));
		// return이 있는 메소드를 오버라이딩하면 람다식에도 return 이 있어야 함
		// 단, 오버라이딩에 return 문장밖에 없으면 {} 과 return 생략 가능
		// i+j; == { return i+j; };
		
		
		// 람다식은 인터페이스에 메소드가 하나만 있을 때 사용 가능하다.
		// 왜나면 메소드가 두개면 -> 가 가리키는 메소드가 뭘 말하는지 알 수 없으니까
		// @FunctionalInterface는 한개의 메소드만 가질 수 있는 인터페이스라고 컴터에게 알려주는 표시다
		
		
		
	}

}

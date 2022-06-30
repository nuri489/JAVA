package Chapter_4;


class A {
	
	int m1() 
	{
		int i = 10;
		return i*i;
	}
	
	double m2()
	{
		return 3.14;
	}
	
	String m3()
	{
		String s1 = "m3";
		return s1 + "메소드";
	}
	
	int[] m4()
	{
		int[] i = {1,2,3};
		return i;
	}
	
	void m5()
	{
		int j = 10;
		System.out.println(j*j);
	}

	// void는 return이 없음을 의미함.
	// main은 return 해봐야 의미가 없으므로 항상 void
	
	Person m6()
	{
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 30;
		return p1;
	}
	
	// Static_test.java 파일에서 참조 
	// 리턴 타입이 Person ?
	
	int a;			// 멤버변수, 자동으로 초기화 됨 -> 그냥 출력하면 0 출력
	
	int m7(int k)  // 매개변수, 호출 할때 마다 초기화 됨
	{
		int j = k; // 지역변수, 자동으로 초기화 안됨 -> final 처럼 초기화 필요
		return j;
	}
	
	
}


public class method {

	public static void main(String[] args) {
		
		A a1 = new A();
		
		System.out.println(a1.m1());
		// m1 : 변수 i를 10으로 초기화 후, i*i 로 그 값을 내보내는 method
		
		System.out.println(a1.m3());
		
		System.out.println(a1.m4());
		
		// 배열의 주소값을 출력함
		
		int [] result = a1.m4();
		for(int i=0; i<result.length; i++)
		{
			System.out.println(result[i]);
		}
		// 배열의 값을 출력하기 위해 메소드의 배열을 새로운 배열에 할당하고
		// 그 배열에 i값을 하나씩 넣어서 하나씩 출력함.
		
		a1.m5();
		
		Person result1 = a1.m6();
		System.out.println(result1.name);
		
		
		System.out.println(a1.m7(321));
		// 321, 매개변수 k에 321 대입 후 j=k 이므로 j 값을 리턴하는 m7에서 321 출력됨.

	}

}

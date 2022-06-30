
package Chapter_4;

class Data
{
	int num = 10;
}

class B
{
	void addInt(int i)
	{
		System.out.println("addInt 메소드내부 i= " + i++);
	}
	
	void addData(Data d) // Data d = new Data(); ?
	{
		System.out.println("addData 내부 = " + d.num ++);
	}
	
}

public class Call_By_Value_test {

	public static void main(String[] args) {
		
		
		B b1 = new B();
		int j = 10;
		b1.addInt(j);
		System.out.println("addInt 메소드 호출 후의 j= " + j);
		
		Data d2 = new Data();
		b1.addData(d2);				// addData 메소드에 d2라는 변수 투입?
		System.out.println("addData 메소드 호출후의  = "+ d2.num);
		
		
		
		// 값을 복사해서 넘기느냐, 주소를 복사해서 넘기느냐의 차이?
		
		// Math.random() : Math 클래스의 random 메소드 호출

	}

}

package Chapter_4;


class Outer {
	int i = 10;
	class Inner {
		int j = 20;
	}
	// Inner 클래스

	void outermethod()
	{
		class Inner3 {
			int n = 40;
		}
		Inner3 i3 = new Inner3();
	}
	// Outer에 존재하는 메소드 안에 Inner 클래스
	// Inner3는 지역 변수 처럼 사용
	// 즉, 해당 클래스가 존재하는 메소드 안에서만 사용 가능함
	// Outer 클래스에서도 사용 불가
	
}







public class InnerTest {

	public static void main(String[] args) {
		
		Outer o = new Outer();
		Outer.Inner oi = o.new Inner();
		
	}

}

package Chapter_4;

class Circle {
	
	int radius;
	final static double pi =3.14;
	// 값이 변하지 않는 파이값이므로 고정함
	
	double area = radius*radius*pi;
	int x = 100; // 원의 중심 x 좌표
	int y = 200; // 원의 중심 y 좌표
	
}

public class Final_test {

	public static void main(String[] args) {
		
		// 반지름이 5인 원 만들기
		
		
		Circle c = new Circle();
		
		c.radius = 5;
//		c.pi = 3;	final 변수이므로 수정불가
		
		
		System.out.println("반지름 5인 원의 면적은 "+ c.area);
		// area은 Circle 클래스에서 값이 입력되지 않았고, 이를 불러오므로 0으로 출력
		
		c.area = c.radius*c.radius*Circle.pi;
		// area에 새로운 값들로 다시 계산하여 입력
		
		System.out.println("반지름 5인 원의 면적은 "+c.area);
		

		

	}

}

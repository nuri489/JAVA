package Chapter_5;

abstract class Shape {
	
	String name;
	abstract void area();
	abstract void circum();
	// 내용이 없는 abstract 메소드들
}

class Circle extends Shape {
	
	int r;
	final double pi = 3.14;
	
	Circle (String name , int r)
	{
		this.name = name;
		this.r = r;
	}
	
	void area()
	{
		System.out.println(r*r*pi);
	}
	
	void circum()
	{
		System.out.println((int)(r*pi));
	}
}

class Rectangle extends Shape {
	
	
	String name;
	int width;
	int heigt;
	
	Rectangle(String name, int width , int height)
	{
		this.name = name;
		this.width = width;
		this.heigt = height;
	}
	
	void area()
	{
		System.out.println(width*heigt);
	}
	
	void circum()
	{
		System.out.println(2*width + 2*heigt);
	}
	
	// abstract 클래스를 상속받으면 해당 클래스의 존재하는 abstract 메소드를 오버라이딩 해야함.
}

public class Abstract {

	public static void main(String[] args) {
		
		Circle c = new Circle("원",5); // 반지름이 5인 원 객체 생성
		Rectangle r = new Rectangle("사각형",6,8);
		c.area(); // 반지름이 5인 원의 면적
		c.circum(); // 반지름이 5인 원의 둘레
		r.area(); // 사각형의 면적
		r.circum();

//		Shape s = new Shape();
		// abstract 클래스는 객체 생성이 불가능함
		
		// 즉, 객체 생성이 불가능한 abstract 클래스는 놔두고 이 클래스를 상속하는
		// 다른 클래스의 객체를 생성하여 값을 출력함.
		// 다만 abstract 클래스를 상속하면 abstract 메소드는 오버라이딩 되야함.
		
		
		// 자바의 최상위 클래스는 java.lang.Object 이다.
		// 다른 클래스의 상속을 명시하지 않으면 Object 클래스를 자동으로 상속함
		
	}

}

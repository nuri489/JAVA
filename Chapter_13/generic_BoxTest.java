package Chapter_13;

// 책 657 참고

import java.awt.print.Paper;

class Apple1 {
	
	String origin;
	Apple1(String origin)
	{
		this.origin = origin;
	}
}

class Paper1 {
	
	String size;
	Paper1(String size)
	{
		this.size = size;
	}
}

class Box1<T> {
	
	T contents;
	// Object 타입의 contents 변수

	public T getContents() 
	{
		return contents;
	}

	public void setContents(T contents) 
	{
		this.contents = contents;
	}
	
}

class Box2<T1 , T2> {
	
	T1 o1;
	T2 o2;
	

	Box2(T1 o1 , T2 o2)
	{
		this.o1 = o1;
		this.o2 = o2;
	}
	
}

class Box3<T extends Number> {
	
	T num;
	
	Box3(T num)
	{
		this.num = num;
	}
	
}

public class generic_BoxTest {

	public static void main(String[] args) {

		Box2<Apple1, Paper1> b1 = new Box2(new Apple1("경북"), new Paper1("A4"));
		// 위 클래스에서는 Box2에 대하여 T1과 T2 타입의 변수만 받겠다고 했지만 객체생성을 하며 변경함
		
		System.out.println(b1.o1.getClass().getName());
		System.out.println(b1.o2.getClass().getName());
		
		// o1과 o2의 타입의 이름을 출력
		
		Box2<String , Integer> b2 = new Box2("영주", 100);
		
		System.out.println(b2.o1.getClass().getName());
		System.out.println(b2.o2.getClass().getName());
		
		Box3<Integer> b3 = new Box3(100);
		Box3<Double> b4 = new Box3(100.123);
		
		System.out.println(b3.num.getClass().getName());
		System.out.println(b4.num.getClass().getName());
		
		Box3<String> b5 = new Box3("1");
		
		
		/*		
		Apple1 a = null;
		Paper1 p = null;
		
		if(args[0].equalsIgnoreCase("apple"))
		{
			a = new Apple1(args[1]);
			Box1<Apple1> b1 = new Box1();
			b1.setContents(a);
			Apple1 o = b1.getContents();
			System.out.println(o.origin);
		}
		else if(args[0].equalsIgnoreCase("paper"))
		{
			p = new Paper1(args[1]);
			Box1<Paper> b2 = new Box1();
			b2.setContents(p);
			Paper1 o = b2.getContents();
			System.out.println(o.size);
		}

		
		if(a != null)
		{
			b1.setContents(a);
		}
		else if(p != null)
		{
			b1.setContents(p);
		}
		
		Object o = b1.getContents();
		
		if(o instanceof Apple)
		{
			System.out.println(((Apple)o).origin);
		}
		else if(o instanceof Paper)
		{
			System.out.println(((Paper)o).size);
		}
		
		
		// 값이 담긴 o의 객체타입을 바꿔서 origin 출력
*/
	}
}

package Chapter_13;

class Apple {
	
	String origin;
	Apple(String origin)
	{
		this.origin = origin;
	}
}

class Paper {
	
	String size;
	Paper(String size)
	{
		this.size = size;
	}
}

class Box {
	
	Object contents;
	// Object 타입의 contents 변수

	public Object getContents() 
	{
		return contents;
	}

	public void setContents(Object contents) 
	{
		this.contents = contents;
	}
	
}

public class nonegeneric_BoxTest {

	public static void main(String[] args) {
		
		Apple a = null;
		Paper p = null;
		
		if(args[0].equalsIgnoreCase("apple"))
		{
			a = new Apple(args[1]);
		}
		else if(args[0].equalsIgnoreCase("paper"))
		{
			p = new Paper(args[1]);
		}

		Box b1 = new Box();
		
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
		
	}


}

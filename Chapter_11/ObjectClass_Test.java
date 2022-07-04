package Chapter_11;

public class ObjectClass_Test {

	public static void main(String[] args) {
		
		myobject o1 = new myobject("A");
		Object o2 = new Object();
		myobject o3 = new myobject("A");
		
		System.out.println(o1);
		System.out.println(o2);
		
		System.out.println(o1.toString());
		System.out.println(o2.toString());
		
		if(o1 == o2)
		{
			System.out.println("o1 == o2 같다");
			
		}
		
		if(o1.toString().equals(o3.toString()))
		{
			System.out.println("o1.equals(o3) 같다");
		}
	}
	


}


class myobject {
	
	String msg;
	myobject(String msg)
	{
		this.msg = msg;
	}
	
	public String toString()
	{
		return msg;
	}
	
	public String equals()
	{
		return msg;
	}
	
	public boolean equals(Object obj) 
	// equals(Object obj)에 true 또는 false 값 입력

	{
		if(obj instanceof myobject)
		{
			return this.msg.equals( ( (myobject) obj).msg);
			
		}
		else
		{
			return false;
		}
	}
	
	
}

// myobject는 Object 클래스를 상속 받음
// toString 메소드를 오버라이딩 함
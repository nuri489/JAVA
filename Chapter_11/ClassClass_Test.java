package Chapter_11;

public class ClassClass_Test {

	public static void main(String[] args) {

		try 
		{
		Class c = Class.forName(args[0]);
		Object o = c.newInstance();
		}
		catch(Exception e)
		{
		}
	
		//  Class.forName(args[0]);
		// args[0] 이라는 String을 클래스 이름으로 바꿔주겠다.
		// args[0] 이 A 라면 A라는 클래스 타입으로 변환
		
		// Object o = c.newInstance();
		// 클래스 타입의 객체 생성

		
		
		
		

	}

}

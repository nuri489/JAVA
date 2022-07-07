package Chapter_15;

import java.util.ArrayList;

class TEST {
	
	int x;
	TEST(int x)
	{
		this.x = x;
	}
}

public class For_Test {

	public static void main(String[] args) {
		
		String arr[] = {"java" , "db" , "web client" , "web server" , "ai" };
		for(String s : arr)
		{
			System.out.println(s.toUpperCase());
		}

		ArrayList<String> list = new ArrayList<String>(5);
		list.add("java");
		list.add("db");
		list.add("web client");
		list.add("web server");
		list.add("ai");
		list.add("spring");
/*		list.add(100);
		for(Object s : list)
		{
			if(s instanceof String)
			{
				System.out.println(((String)s).toUpperCase());
			}
			else
			{
				System.out.println(s);
			}
		}
*/
		for(String s : list)
		{
			System.out.println(s.toUpperCase());
		}
		
		
		ArrayList<TEST> list2 = new ArrayList<TEST>();
		TEST t = new TEST(10);
		list2.add(t);
		
		System.out.println(list2.get(0));
		
	}
	
	// 개선된 for 문
	// (배열의 타입 + 변수명 : 배열이름) 의 형태로 작성함
	
	// ArrayList의 경우 타입은 Object 타입이다
	// 따라서 toUpperCase() 같은 String 전용 명령어를 사용하려면 명시적 형변환을 해줘야 함
	
	// 그런데 만약에 ArrayList에 String이 아니라 int 타입의 변수가 들어온다면?
	// int는 String으로 형변환이 불가능하기 때문에 오류 발생!
	// 25) 해결을 위해 instanceof 를 통해서 변수가 String 타입의 변수인지 판별하여 구분한다
	
	// 15) <String>은 ArrayList에 String 타입의 변수만 저장하겠다는 의미
	// 이렇게 함으로써 ArrayList의 변수들이 Object 타입이 아닌 String 타입으로 저장이 되며
	// 35) for 문에서 Object 대신 String 으로 작성 가능하다.
	// 위와 같이 저장될 타입을 정해주지 않으면 입력 받는 모든 변수를 일단 Object로 변환하고
	// 나중에 다시 출력할때 원래 타입으로 변환하는 이중 작업을 해야하므로 효율 적이지 않음.
	
	// 만약에 <> 안에 클래스 이름이 들어간다면?
	
	

}

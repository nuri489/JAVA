package Chapter_4;

public class static_and_non_static {
	

		String name;
		int age = 10;
		final static String nation = "대한민국";
		
		static void showPerson()
		{
			System.out.println(name + " " + age + " " + nation);
		}
		
		// showPerson 메소드에 쓰이는 name과 age는 static 변수가 아니므로(non-static)
		// showPerson을 static 메소드로 할 수 없다.
		// 즉, static 메소드에는 static 변수만 넣을 수 있다.
		// 다만 non-static 메소드에 non-static 변수만 넣어야 하느건 아님.
		
		static void showNation()
		{
			System.out.println(nation);
		}
		
		// nation은 static 변수이므로 showNation은 static 메소드로 가능하다.
		
		
		double i = Math.random();
		
		// 예를들어 Math 메소드는 static 메소드이므로 따로 불러오지 않고 바로 사용 가능함.
		

}

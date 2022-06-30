package Chapter_4;

class c {
	
	int add(int i , int j) // add라는 메소드
	{
		return i+j;
	}
	
	String add(String i , String j)
	{
		return i+j;
	}
	
	// 메소드 이름이 같고 매개변수가 다르다면 오버로딩?
	
	double add(double i , double j , double k)
	{
		return i+j+k;
	}
	
	
}

public class overloading_test {

	public static void main(String[] args) {
		
		c c1 = new c();
		String r1 = c1.add("A", "B");
		int r2 = c1.add(0, 0);
		double r3 = c1.add(1, 2, 3);
		
		System.out.println(r1 + " " + r2 + " " + r3);
		
		int r4 = Integer.parseInt("123", 5);
		System.out.println(r4);
		
		
		
		
		
	}

}

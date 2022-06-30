package Chapter_4;

class Employee {
	
	final int id;
	String name;
	double pay;
	String dept;
	String title;
	
	Employee(int i , String n)
	{
		id = i;
		name = n;
	}
	
	// 생성자 Employee()는 {} 안에 정의된 수식들을 실행함?
	// () 안에는 변경될 변수들을 넣고 {} 안에 그 변수를 이용한 수식을 정의함

}


public class Employee_test {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(56 , "권도연");
		System.out.println(e1.id + " " + e1.name);
		
		Employee e2 = new Employee(45 , "김기로");
		System.out.println(e2.id + " " + e2.name);

		// new Employee(a,b); 를 통해서 순서대로 정의된 수식에 a와 b를 사용하여 수행함.
		// 결국 간소화된 코드를 작성하는데에 큰 도움을 준다?
		
		e1.id = 123;
		// final 변수인 id를 원래 클래스에서 초기화를 하지 않고 해당 변수를 수정하는 생성자를 통해서
		// 다른 클래스에서 그 값을 초기화 하고 고정함.
		

	}

}

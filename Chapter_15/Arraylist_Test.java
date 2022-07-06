package Chapter_15;

import java.util.ArrayList;

class Employee {
	
	int id;
	String name;
	double pay;
	Employee(int id, String name, double pay)
	{
		this.id = id;
		this.name = name;
		this.pay = pay;
	}
	@Override
	public String toString() 
	{
		return id + "-" + name + "-" + pay;
	}
	
	
}

public class Arraylist_Test {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList(3);
		// 5 크기의 배열 생성
		int a = 100;
		Integer in = new Integer(100);
		
		
		list.add("java");
		list.add(100);
		list.add(3.14);
		list.add("jsp");
		
		Employee e1 = new Employee(100, "김기로" , 300);
		list.add(e1);
		
		Employee e2 = new Employee(200, "권도연" , 600);
		list.add(e2);
		
		System.out.println(list.size());
		// 추가한 데이터의 크기 출력
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(i + "번째 위치의 값은 " + list.get(i));
		}
		
		// list.get(i) 뒤에는 .toString();이 생략되어 있다.
		// 따라서 toString 메소드를 오버라이딩 하여 값들을 하나의 String으로 바꿔서 출력함
		// 100 과 김기로 , 300 이라는 각각의 값이 아니라
		// + "-" 을 통해서 100-김기로-300 이라는 하나의 String으로 만들고 출력함

	}

}

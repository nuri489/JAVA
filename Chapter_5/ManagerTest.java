package Chapter_5;

class Employee {
	
	private int id;
	static String name;
	double pay;
	
	void printEmp()
	{
		System.out.println(id + ":" + name + ":" + pay);
	}
}

class Manager extends Employee { // Employee 클래스 상속
	
	String jobOfManage;
	String name;
	

	@Override void printEmp()
	{
		System.out.println("?:" + name + ":" + pay);
	}
	
	// @Override는 시스템에게 건네는 주석같은 것으로 우리가 봤을땐 overriding 인데
	// 시스템이 이를 알아채지 못할때 overridng 인지 확인하고 실행하라는 주석임
	
	void test()
	{
		String name = "지역변수";
		System.out.println(name); // 지역변수 출력
		System.out.println(this.name); // 멤버변수 출력
		System.out.println(super.name); // 상속멤버변수 출력
	}

}

public class ManagerTest {

	public static void main(String[] args) {
		
		Manager m = new Manager();
//		m.id = 200;
		// 상속을 받았어도 private 변수는 해당 클래스 내부에서만 사용 가능하므로 사용 불가함
		m.pay = 1595.65;
		m.jobOfManage = "IT관리";
		
		Employee m1 = new Employee();
		
		m1.name = "권도연";
		System.out.println(m1.name);
		System.out.println(m.name);
		// Employee의 name을 권도연으로 초기화하였고 이 name은 static 변수이므로
		// Manger 클래스에서 상속받을때 이미 초기화 된 값을 상속 받음
		// 따라서 권도연 , 권도연으로 출력됨
		// 단, name이 static 이 아니라면 권도연 , null (값이 없으므로) 로 출력
		
		// 만약에 Manger에 이름이 같은 name 변수가 이미 존재한다면
		// Employee 로 부터 해당 변수의 값은 상속받지 않으므로 권도연 , null 로 출력됨
		
		
		m1.printEmp();
		m.printEmp();
		// 메소드도 상속 받을 수 있다.
		// 변수와 마찬가지로 같은 이름의 메소드가 이미 존재한다면 원래 존재하던 메소드 우선됨
		// 이를 overriding 이라고 함. (overloading 과 다름)
		
		
		m.test();
		
		
		// super.메소드 = 하위클래스에서 메소드 오버라이딩이 일어나면 상위클래스 메소드 호출 재사용
	}

}

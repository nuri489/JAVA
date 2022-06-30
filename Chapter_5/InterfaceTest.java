package Chapter_5;

class TTT {}



class StudentWorker extends TTT implements Student,Worker { 
	// 두 인터페이스를 다중상속함
	// 즉, 인터페이스를 구현하는 StudentWorker 클래스
	// 두 인터페이스에 있는 모든 메소드의 내용을 정의해야 함
	// 상속과 이행은 서로 구별되므로 상속과 이행은 동시에 가능함
	
	public void study()
	{
		System.out.println("조교는 오전에 공부하다");
	}
	// 해당 메소드가 있는 인터페이스에는 study 메소드 앞에 abstract public이 붙어있음
	// 따라서 앞에 public 붙어줘야 하며, 오버라이딩 되야함
	
	public void work()
	{
		System.out.println("조교는 오후에 일을 함");
	}
	
	public void lunch()
	{
		System.out.println("조교는 점심을 먹는다");
	}
	
	String name = "조교";
	

	
}

// 메뉴에 Source - Override/Implement Methods 기능을 통해서 메소드를 자동 작성 가능함




public class InterfaceTest {

	public static void main(String[] args) {
		
		StudentWorker sw = new StudentWorker();
		
		sw.study();
		sw.lunch();
		sw.work();
		
		System.out.println(sw.name);
		// 두 인터페이스 모두에 name이라는 변수 존재 
		// name이라는 변수에 두개의 값이 있으므로 오류 발생!
		// 하지만 두 인터페이스의 이행을 받는 클래스에서 name 변수를 재정의했다면 그 값으로 출력됨.
		
		System.out.println(Student.name);
		System.out.println(Worker.name);
		// 똑같은 변수에 대하여 인터페이스를 구분하여 출력함
		
		Student sw2 = new StudentWorker();
		System.out.println(sw2.name);
		sw2.study();
//		sw2.work();
		// Student 에는 work가 없으므로
		
		Worker sw3 = new StudentWorker();
//		sw3.study();

		

	}

}

package Chapter_4;

class Student1
{
	String name;
	int i = 0;
	
	private int i1 = 1;
}

// Student라는 클래스를 추가함
// Employee 와 Employee_test 처럼 두개로 나누지 않는 이유는 정보가 담긴 클래스 파일을
// 하나의 자바 파일에 들어가게 하여 실시간으로 불러오는 변수가 무엇인지 파악 및 수정이 가능함.


public class Student_Test {
// 자바 파일의 이름은 public class의 이름과 같아야 함
	
	
	
	public static void main(String[] args) {
		
		Student1 s1 = new Student1();
		s1.name = "김기로";
		System.out.println(s1.name + s1.i);
		
		// 이렇게 Student1 에서 선언된 변수들을 불러오거나 수정할 수 있다.
		// 하지만 main 메소드 안에서 선언된 변수는 지역변수로써, main 메소드 안에서만 사용 가능함.
		
		main_test m1 = new main_test();
		
//		System.out.println(m1.z);
//		main_test 클래스의 main 메소드 안에서 선언된 변수 z는 지역변수이므로 출력 불가능함.
		
		
//		System.out.println(s1.i1);
//		변수 i1은 private 변수이므로 해당 클래스인 Student 에서만 사용 가능함.

		
		
		
		
	} 

}

package Chapter_3;

public class returnTest {
	
	public static void test(){
	
		System.out.println("Test 메소드 시작");
		if(true)
		{
			return; // 메소드를 중단한다?
		}
		System.out.println("Test 메소트 종료");
		
	}

	public static void main(String[] args) {
		
		System.out.println("main 메소드 시작");
		test(); 
		// test 메소드를 시작하기 위해선 main에서 시작해줘야 함
		System.out.println("main 메소트 종료");
		
	
	}

}

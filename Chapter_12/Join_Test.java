package Chapter_12;

class C extends Thread {
	
	int data = 10;
	
	public void run()
	{
		try 
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			
		}
		data = data*2;
	}
}

public class Join_Test {

	public static void main(String[] args) {
		
		System.out.println("메인 시작");
		
		C c1 = new C();
		c1.start();
		
		try
		{
			c1.join();
		}
		catch(InterruptedException e)
		{
			
		}
		
		System.out.println(c1.data);
		// c1.start(); 는 run 메소드를 실행 할 준비
		// 즉, 메인이 끝나고 run 이 실행이 됨
		// c1.join();을 통해서 cpu에게 실행 순서를 바꾸도록 함
		// 메인 실행 -> join 만남 -> 해당 Thread로 실행순서 변경 -> 해당 Thread의 run 실행
		
		
		c1.run();
		System.out.println(c1.data);
		// 아니면 그냥 c1.run();으로 run 메소드 강제 실행 가능
		// 근데 이건 그냥 메소드 불러오는거잖아?
		
		System.out.println("메인 종료");
		
	}

}

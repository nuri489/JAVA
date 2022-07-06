package Chapter_12;

class A extends Thread {

	@Override
	public void run() 
	{
		System.out.println(getName() + " 쓰레드의 우선순위 : " + getPriority());
		
		for(int i=0; i<6; i++)
		{
			System.out.println(getName() + " 스레드");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		// Thread 클래스에도 Name 변수가 있지만 Private 변수이므로 get 메소드를 통해 가져옴
		// Thread.sleep(1000); 을 통해 (1/1000) X 1000 = 1 초의 시간만큼 쉼
		// Inter.. 에러가 나므로 해당 에러를 무시하도록 try&catch 사용
	}
	
	// Thread 클래스를 상속받으면 run 메소드를 무조건 오버라이딩 해야 함
	
}

public class Thread_Test {

	public static void main(String[] args) {
		
		A a1 = new A();
		A a2 = new A();
		
		a1.setName("A");
		// 쓰레드의 name 변수를 정하는 Thread 클래스의 setName 메소드
		
//		a1.setPriority(Thread.MAX_PRIORITY);
//		a2.setPriority(Thread.MIN_PRIORITY);
		// 우선순위를 정하는 setPriority 메소드
		// 규모가 작은 작업에서는 의미가 거의 없다.
		
		a1.start();
		a2.start();	
		
		System.out.println("main thread 종료");
		// 메인을 먼저 끝내고 대기하고 있는 start 메소드를 실행됨

	}

}

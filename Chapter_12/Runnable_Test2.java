package Chapter_12;

public class Runnable_Test2 {

	public static void main(String[] args) {
		
		Runnable r1 = new Runnable() 
		{
			public void run()
			{
				for(int i =0; i<3; i++)
				{
					System.out.println("X");
				}
			}	
		};
		// Runnable 클래스를 상속받는 무명의 하위 클래스 생성
		// 생성과 동시에 상속을 받음
		
		
		Thread th1 = new Thread(r1);
		th1.start();
		
		System.out.println("끝");

	}

}

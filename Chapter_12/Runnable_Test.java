package Chapter_12;

class B implements Runnable {
	
	String name;
	B(String name)
	{
		this.name = name;
	}
	
	@Override
	public void run()
	{
		for(int i =0; i<3; i++)
		{
			System.out.println(name);
		}
	}
	
}

public class Runnable_Test {

	public static void main(String[] args) {
		
		B b1 = new B("B");
		B b2 = new B("BB");
		
		Thread th1 = new Thread(b1);
		Thread th2 = new Thread(b2);
		th1.start();
		th2.start();
		
		// Thread 타입의 객체를 
		
		System.out.println("끝");

	}

}

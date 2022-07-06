package Chapter_12;

class Data {
	
	int value;
	
	public synchronized void saveValue(int value)
	{
		this.value = value;
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println(Thread.currentThread().getName() + " , " + this.value);
		// Thread.currentThread() 은 현재 실행되는 스레드의 객체값을 나타냄
		// 뒤에 getName()을 붙여 해당 객체의 이름을 불러옴
		// 쓰레드의 Run 메소드가 호출하는 메소드에 synchronized 를 붙여서
		// 해당 메소드를 호출하는 쓰레드가 여러개일때 한 쓰레드가 사용 중이면
		// 다른 쓰레드를 대기 시킴 -> 그래서 느려짐
	}
}

class DataThread1 extends Thread {
	
	Data d;
	// Data 클래스 타입으로 선언된 변수 d
	DataThread1(String name, Data d)
	{
		super(name);
		this.d = d;
	}
	
	public void run()
	{
		d.saveValue(10);
	}
}

class DataThread2 extends Thread {
	
	Data d;
	// Data 클래스 타입으로 선언된 변수 d
	DataThread2(String name, Data d)
	{
		super(name);
		this.d = d;
	}
	
	public void run()
	{
		d.saveValue(20);
	}
}

public class Synchronized_Test {

	public static void main(String[] args) {
		
		Data d = new Data();
		DataThread1 t1 = new DataThread1("쓰레드1" , d);
		DataThread2 t2 = new DataThread2("쓰레드2" , d);
		
		t1.start();
		t2.start();
	}

}

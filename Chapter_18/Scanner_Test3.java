package Chapter_18;

import java.text.DecimalFormat;
import java.util.Scanner;

class Employee {
	
	int id;
	String name;
	double pay;
	
	public Employee(int id, String name, double pay) 
	{
		super();
		this.id = id;
		this.name = name;
		this.pay = pay;
	}

	@Override
	public String toString() 
	{
		DecimalFormat format = new DecimalFormat("#,###.00");
		return id+" 사번 "+name+" 사원의 연봉은 "+format.format(pay*12)+" 입니다.";
	}
	
	
	
}

public class Scanner_Test3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("사번은 ");
		int a = s.nextInt();
		System.out.print("사원의 이름은 ");
		String b = s.next();
		System.out.print("사원의 월급은 ");
		double c = s.nextDouble();
		
		Employee e = new Employee(a,b,c);
		
		System.out.println(e);
		
		// 스캐너를 통해서 객체 생성을 할 때 값을 초기화 하였고
		// toString 메소드를 오버라이딩 하여 객체를 출력하면 오버라이딩 된 toString이 출력되게 함
		
		
		String line = s.nextLine();
		String[] word = line.split(" ");
		int a = Integer.parseInt(word[0]);
		String b = word[1];
		double c = Double.parseDouble(word[2]);
		
		// 사번, 이름, 월급을 '한 줄'에 쭈욱 입력받음
		// String[] word = line.split(" "); 을 통해서 공백(" ")을 통해서 각 글자를 구분함
		// 구분된 변수들을 배열에 할당함

	}

}

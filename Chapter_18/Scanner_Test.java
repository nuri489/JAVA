package Chapter_18;

import java.util.Scanner;

public class Scanner_Test {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("2개의 정수를 입력하면 덧셈 결과 출력");
		
		int i1 = s.nextInt();
		int i2 = s.nextInt();
		System.out.println(i1 + i2);
		
		String x1 = s.next();
		System.out.println(x1);
		
		s.nextLine();
		String x2 = s.nextLine();
		System.out.println(x2);
		
		
		// 값을 입력받고 변수에 저장 후 출력함
	}

}

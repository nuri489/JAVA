package Chapter_1;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		short a = 1;
		int b = 1;
		int c = 2;
		
		boolean F = (10 == 4); 
		// 10 = 4 인가? 아니므로 false로 저장
		
		/* char e = 'a';
		String d = "A"; 
		따옴표와 쌍따옴표 구분하기
		
		byte f = -1;
		*/
		
		System.out.println("a의 값 출력 :"+ a);
		// ("a의 값 출력:" , a) 아님 +로 구분할 것
		
		System.out.println(b + c);
		// 1 2 가 아니라 1+2 해서 3으로 나옴
		
		// String에 + 붙이면 각자 출력
		// 정수 및 실수에 + 붙이면 그 합을 출력
		// 만약 String + 정수 + 정수면?
		// 순서대로 계산 -> A + 1 + 2 = (A + 1) + 2 = A 1 2
		// 정수 + 정수 + String 이면? = 1 + 2 + A = (1 + 2) + A = 3 A
		
		System.out.println("int의 최대값 :" + Integer.MAX_VALUE);
		System.out.println("int의 최소값 :" + Integer.MIN_VALUE);
		
		int i = 2147483647 +1;
		System.out.println(i);
		// 스택오버플로우
		
		int i1 = 25;
		char c1 = 'A';
		
		System.out.println(i1 + c1);
		//30+65=95, A는 65 이므로.. ?
		
		System.out.println( (char)i1 );
		// 25에 해당하는 char 로 바꿔서 출력
		
		int s1 = 4%3;
		System.out.println(s1);
		// 4%3 = 4를 3으로 나누고 남은 값 = 1
		
		boolean D1 = true;
		boolean D2 = false;
		System.out.println(D1&&D2);
		System.out.println(D1||D2);
		// false 와 true
		// && = 둘 모두 트루면 트루값 출력, || = 하나라도 트루면 트루값 출력
		
		System.out.println(D1?"Y":"N");
		// D1의 트루이면 Y 실행, 아니면 N 실행
		
		System.out.println(5>10 && 5<20?1:2);
		
		
		
		
		System.out.println(++i1);
		// int i1 에 +1를 하고 출력
		
		int F1 = 127;
		byte F2 = (byte)F1;
		System.out.println(F2);
		// byte F2 = F1; 
		// 자동형변환은 작은 변수에서 큰 변수로만 가능함. 그 값이 가능하다고 하더라도.
		// 명시적형변환은 가능함
		
		char c4 = 'e';
		int i5 = c4;
		System.out.println((char)(i5 -32));
		
		
		int i6 = 0;
		boolean i7 = i6>0;
		
		double i9 = (double)10/3;
		System.out.println(i9);
		
		int x = 10;
		int y = x++;
		System.out.println(y);
		System.out.println(x);
		// 10과 11, y는 +1 하기 전의 x 값을 할당받음
		
		int x1 = 10;
		int y1 = --x1;
		System.out.println(y1);
		System.out.println(x1);
		// 9와9, y는 -1을 한 x 값을 할당받음
		
		y1 = ++x1;
		System.out.println(y1);
		System.out.println(x1);
		// 10과10, ++가 앞에 오던 뒤에 오던 마지막에는 +1을 함.
		
		
		
		
		
	}

}

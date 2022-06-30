package Chapter_1;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문제 1번
		
		int x = 582;
		int y = x/100; // 정수로 선언했기에 x 값에 상관없이 y 값은 정수, 즉 백단위의 숫자만 남게됨
		System.out.println(x + "의 백단위는" + y*100 + "입니다");
		
		// 문제 2번
		
		int cntOfBooks = 97;
		int cntOfStu = 12;
		
		// boolean X = (cntOfBooks >= cntOfStu);  굳이 식을 따로 추가 할 필요 없음
		
		int Book1 = cntOfBooks/cntOfStu;
		int Book2 = cntOfBooks%cntOfStu;
		
		System.out.println(cntOfBooks >= cntOfStu?"1명의 학생당 " + Book1 + "권씩 가질 수 있습니다. \n" + "남아있는 책은" + Book2 + "권 입니다."
				:"나눠줄 수 없습니다");
		
		
		//문제 3
		
		int a = 10;
		int b = 13;
		int c = 3;
		
		System.out.println((double)((a+b)*c/2));
		
		//문제 4
		
		int i = 6;
		//boolean i1 = (i%3==0);
		//boolean i2 = (i%7==0);
		
		System.out.println(i%3==0?"변수는 3의 배수이면서":"변수는 3의 배수가 아니며");
		System.out.println(i%7==0?"변수는 7의 배수이다":"변수는 7의 배수가 아니다");
		
		
		//문제 5
		
		int a1 = 10;
		int b1 = 20;
		int c1 = a1;
		a1 = b1;
		b1 = c1;
		// 변수 c 를 하나 더 추가해서 돌려막기
		
		System.out.println(a1);
		System.out.println(b1); // ??

		//문제 6
		
		String name = "이자바";
		int java = 100;
		int db = 77;
		int spring = 89;
		int sum = (java+db+spring);
		double avg = ((java+db+spring)/(double)2);
		
		System.out.println(avg);
		
		

	}

}

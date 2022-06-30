package Chapter_3;

import javax.swing.JOptionPane;
// 변수 입력 함수를 라이브러리에서 가져오기

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int i = Integer.parseInt(JOptionPane.showInputDialog("i = "));
		
		//JOptionPane.showInputDialog로 변수 입력받음
		//하지만 String으로만 받을 수 있으므로 Integer.parseInt 사용하여 int 값으로 받음
		
	
//		if(i%3==0) 
//			{ System.out.println(i+ "는(은) 3의 배수이다"); }
//		else
//			{ System.out.println(i+ "는(은) 3의 배수가 아니다"); }
		
		
		
		int a = 1;
		
		if (1==1) 
		{
//			a = 0;
//		int a = 0;
		}
		System.out.println(a);
		
		// if문 안에서 변경된 변수는 if 문이 끝나도 유지되지만, if문 안에서 선언된 변수는 유지되지 않는다.
		// 즉, if문 안에서 선언된 변수는 if문 안에서만 사용된다.
		
		
		String grade = "";
		double avg = Math.random()*100;
		// avg 값을 임의로 부여받음, 랜덤값은 1 이하이므로 100을 곱해서 1~100 사이 값 나오게 함
		
		System.out.println(String.format("%.3f",avg));
		// 소수점 3번째 자리까지 표시
		
		if (avg >=90) 
		{
			grade = "A";
		} 
		else 
		{
			grade = "B";
		}
		
		System.out.println(grade);
		// 값이 없는 변수를 외부에서 선언하고, if문 안에서 변수만 변경하여 외부에서 활용함
		

		System.out.println((int)(Math.random()*6)+1);
		// 1~6이 있는 주사위. (0~1)*6을 int로 취해서 소수점 날려버리고 +1을 해서 1부터 시작되게 함
		
		
		int month = (int)(Math.random()*4)+1;
		int day = 0;
		// 변수 선언은 조건문 밖에서 하기!
		
		switch (month) 
		{
		case 1:day = 31; // month 값이 1인 경우 day에 31 부여
			break;
		case 2:day = 28;
			break;
		case 3:day = 31;
			break;
		default :
			break;
		}
		
		if(month<=3) {System.out.println(month + "월은 " + day + " 일 입니다.");}
		// month 값에 따라 해당값이면 day 값을 부여하고 멈춤
		// month 값이 각 케이스별에 해당되지 않는다면 default에 해당되는 day 값 부여
		else {System.out.println(month + "는(은) 잘못된 값입니다");}
		
		// switch 문이 if 문보다 처리속도가 빠르므로 보통 switch 문이 더 좋긴 하다는데..
		
		
		int avg1 = (int)avg/10; // 99~90/10 = 9.x 이므로..int 취하면 9가 나온다.
		
		switch(avg1)
		{
		case 9:grade = "90점대"; // 점수가 99~90 사이일때 값이 9가 나오므로 해당 범위의 점수 모두를 나타냄
			break;
		default :grade = "그 외";
			break;
		}
		
		System.out.println(grade);
		
		int x = 0;
		for(x=1; x<10; x++)	
		{ System.out.println(x); }
		
		for(x=1; x<10; x++);         	
		System.out.println(x);
		
		// 1~9 그리고 10이 출력됨
		// for 문 안에서 할당된 x 값은 외부로 나오지 않고 for문의 {} 안에서만 사용되지만
		// for 문 뒤에 ; 를 붙이면 해당 for 문에서 할당된 x 값은 외부로 나감
		// 따라서 첫번째 for 문에서는 1에서 9까지 반복해서 출력하고
		// 두번째 for문에서는 for문 안에서 10까지 반복 후 그 10을 외부로 출력 후 외부의 sysout으로 표시함
		
		System.out.println(x);
		// 10, for; 문에 의해 10으로 할당되었으므로 for문 밖이더라도 10이 출력됨
										
		

		
		


	
		
	}
}

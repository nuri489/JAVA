package Chapter_3;

public class DiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 주사위 2개를 던져서 각 숫자와 합을 출력하며, 그 합이 5일 때 까지 반복
		
		// 1. 주사위 두개를 던져서 값을 얻는다
		// 2. 그 합을 구한다.
		// 3. 합을 확인하고 표시한다.
		// 4. 합이 5가 아니면 반복한다.
		// 5. 던진 횟수는 루프마다 +1 한다.

		
		
		int y =0; // 던진 횟수
		
		for(int x=0; x==0; x++) // 루프의 반복과 종료를 위해 선언되는 변수 x
		{
			int D1 = (int)(Math.random()*6)+1;
			int D2 = (int)(Math.random()*6)+1;
			int D3 = D1+D2;
			y++;
			
			// 각 주사위의 값과 합, 그리고 던진 횟수 할당됨
			
			if(D3==5)
			{
				System.out.println(y+"번째 굴린 주사위의 합은 "+D1+"+"+D2	+" = " +D3 + " 입니다.\n합이 5이므로 주사위 던지기를 정지합니다.");
				
			}
			else
			{
				x--; 		// 합이 5인 경우에 멈추기 위해 합이 5가 아닌 경우에 x 값을 -1 하여 x 값을 0으로 만들어 다시 루프를 반복하게 함.
				System.out.println(y+"번째 굴린 주사위의 합은 "+D1+"+"+D2	+" = " +D3 + " 입니다.");
			}
		}
		

	}

}

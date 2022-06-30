package Chapter_3;

public class DiceTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int x=0; true;) // 루프 안에서만 사용되는 주사위 던진 횟수를 위한 변수 x에 대한 선언과 무한 반복을 위한 true
		{
			int D1 = (int)(Math.random()*6)+1;
			int D2 = (int)(Math.random()*6)+1;
			int D3 = D1+D2;
			++x;
			// 각 주사위의 값과 합, 그리고 던진 횟수 +1
			
			if(D3==5)
			{
				System.out.println(x+"번째 굴린 주사위의 합은 "+D1+"+"+D2+" = "+D3+" 입니다.\n합이 5이므로 주사위 던지기를 중단합니다.");
				break; // 루프 종료를 위한 break
			}
			else
			{
				System.out.println(x+"번째 굴린 주사위의 합은 "+D1+"+"+D2+" = "+D3+" 입니다.");
			}
		}
		
//		System.out.println(x); 
//		오류 발생. 변수 x가 루프 안에서만 선언되었음을 보여줌

	}

}

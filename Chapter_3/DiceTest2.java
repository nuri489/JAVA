package Chapter_3;

public class DiceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		int y =0;
		
/*		do
		{
		int y =0;  // 루프 안에서만 사용하기 위한 변수 y 선언
		}	
*/		while(true)//;
		{
			int D1 = (int)(Math.random()*6)+1;
			int D2 = (int)(Math.random()*6)+1;
			int D3 = D1+D2;
//			++y;
			{
				if(D3==5)
				{
					System.out.println("주사위의 합은 "+D1+"+"+D2	+" = " +D3 + " 입니다.\n합이 5이므로 주사위 던지기를 정지합니다.");
					break; // 루프 종료를 위한 키워드
				}
				else
				{
					System.out.println("주사위의 합은 "+D1+"+"+D2	+" = " +D3 + " 입니다.");
				}
			}
		}

	}

}

package Chapter_3;

public class sosu {

	public static void main(String[] args) {

		// 2~100 모든 자연수에 대하여 각 자연수들이 소수인지 판단 출력
		// 소수는 1과 자기 자신으로만 나누어지는 수 (x%y = 0)
		// 나머지가 0이 나오는 횟수가 3번 이상이라면 소수가 아님.
		// 2~100을 나타내는 x와 그 x를 나눌 모든 자연수를 나타내는 y
		
		
		int su = 100;
		for(int x=2; x <=su; x++)
		{
			int count = 0;             // 카운트 값을 초기화 해야 하므로 루프안에서 선언
			
			for(int y=1; y <=x; y++)
			{
				if(x%y==0)
				{
					count++;
				}
			}							// for문의 종료 조건(y>x)을 만족하기 전까지 반복하므로 x값은 변하지 않고 count를 변경함
			
			if(count ==2)				// 두번째 for문에서 증가한 count는 루프가 끝나기 전까지 유지됨 
										// 즉, 루프 안에서 선언된 변수는 루프안에서 값이 유지된다. 따라서 마지막 if문을 두번쨰 for문 밖에 배치
			{
				System.out.println(x + "소수");
			}
			else
			{
				System.out.println(x + "소수아님");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
		
			

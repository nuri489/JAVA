package Chapter_3;

public class Second_array {

	public static void main(String[] args) {
		

		int i[][] = new int[3][2];
		// 2개짜리 배열 3개를 생성
		
//		System.out.println(i.length);
		// 3, 배열 i의 개수
//		System.out.println(i[0].length);
		// 2, 첫번째 배열의 데이터 개수
		
/*		for(int x=0; x<i.length; x++)
		{
			for(int y=0; y<i[x].length; y++)
			{
				i[x][y] = (int)(Math.random()*100+1); // x번째 y배열의 값 입력
				System.out.println(i[x][y]);
			}
		}
*/		
		
		for(int x=0; x<=3; x++)
		{
			for(int y=0; y<=3; y++)
			{
				int a[][] = new int[x+1][y+1];
				// {1,1} {1,2} {1,3} {2,1} {2,2} ...
				
				a[x][y] = (int)(Math.random()*100+1); // x번째 y배열의 값 입력
				System.out.println(a[x][y]);
			}
		}
		

		
		
		

	}

}

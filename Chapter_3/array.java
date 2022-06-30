package Chapter_3;

public class array {

	public static void main(String[] args) {

		
		int scores [] = new int[3]; // 3개의 데이터를 저장할 배열 선언 및 생성
		String names [] = {"A","B","C"};
		
		
		
		System.out.println("학생수=" + scores.length); // 배열의 길이 출력
		
/*		for(int i=0; i<3; i++)
		{
			System.out.println(scores[i]);
		}
		
		// 배열의 데이터 값을 입력하지 않았으므로 0으로 출력
		

		for(int i=0; i<3; i++)
		{
			scores[i] = (int)(Math.random()*100) +1;
			System.out.println(scores[i]);
		}
*/		
		// 배열의 값을 1~100 사이에서 랜덤으로 부여 및 출력
		
		
		int sum = 0;
		int avg = 0;
		int max1 = 0;
		String max2 = "";
		int min1 = 100;
		String min2 = "";
		
		for(int i=0; i<scores.length; i++) // 배열의 길이에 따라 자동으로 수정되게 함
		{
			scores[i] = (int)(Math.random()*100) +1;
			sum += scores[i];
			avg = sum/scores.length;
			if(scores[i]>max1)			// i번째 값을 max1과 비교하여 크다면 max1 값을 해당값으로..
			{
				max1 = scores[i];		// max1에 해당되는 점수를 할당
				max2 = names[i];		// max2에 해당되는 학생의 이름 할당
				
			}
			
			if(scores[i]<min1)
			{
				min1 = scores[i];
				min2 = names[i];
			}
			
			System.out.println(names[i]+ "의 점수는 " + scores[i]);
			
		}
		

		System.out.println("1등은 " + max2 + " , " + max1 + "점 입니다.");
		System.out.println("꼴등은 " + min2 + " , " + min1 + "점 입니다.");
		
		
		
		
		String test [] = new String[5];
		
		System.out.println(test[1]);
		// string은 할당되지 않으면 null 로 출력
		
		
		
		
		
		
		
		
	}

}

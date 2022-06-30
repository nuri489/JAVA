package Chapter_3;

public class Pay {

	public static void main(String[] args) {

		String product[] = {"라면", "음료수", "계란", "사과"};
		int price[] = {500 , 2500 , 8000 , 1000};
		int sum = 0;
		
		// 명령행 매개변수 7 2 1 5 카드
		// 명령행 매개변수 7 2 1 5 현금 , 010-1234-5678(현금영수증)
		
		for(int i=0; i<product.length; i++)
		{
			
			System.out.println(product[i] + " " + args[i]+ " 개 " + price[i]*Integer.parseInt(args[i])+ "원");
			sum += price[i]; // 합계
			
		}
		
		System.out.println("총 지불 가격은 "+ sum + " 입니다.");
		
		for(int i= (int)(Math.random()*2) +4; true;)
		{
			if(i==4) // 카드
				{
				System.out.println("지불 수단은 " + args[i] + " 입니다.");
				}
			else // 현금
				{
				System.out.println("지불 수단은 " + args[i] + " 입니다.");
				System.out.println("현금영수증 번호는 " + args[6] + " 입니다.");
				}	
			break;
		}
		

	}
	
}


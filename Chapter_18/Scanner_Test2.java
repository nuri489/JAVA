package Chapter_18;

import java.util.Scanner;

public class Scanner_Test2 {

	public static void main(String[] args) {
		
		
		while(true) {
		System.out.println("1. 회원가입");
		System.out.println("2 로그인");
		System.out.println("3. 종료");
		System.out.print("번호 입력 : ");
		
		Scanner s = new Scanner(System.in);
		int menu = s.nextInt();
		if(menu == 3)
		{
			System.exit(0);
		}
		else if(menu == 1)
		{
			System.out.println("회원가입 블라블라");
		}
		else if(menu == 2)
		{
			System.out.println("로그인 블라블라");
		}
		
		}
	}

}

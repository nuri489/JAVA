package Chapter_3;

public class MainMethodTest {

	public static void main(String[] args) {

		System.out.println("명령행 매개변수 출력" + args.length);
		
		for(int i=0; i<args.length; i++)
		{
		System.out.println(args[i]);
		}
		
		// args.length를 통해 변수의 개수를 파악하고, 이를 출력함
		
		System.out.println(args[0] + args[1]);
		
		// args 배열은 String으로만 값을 받으므로 100+200=300으로 표시되는게 아닌 100200으로 표시됨
		// 따라서 String 을 int 로 바꿔주는 라이브러리 메소드를 사용해야 함.

		System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
		
		// Integer.parseInt(args[0])를 사용하여 String을 int로 바꿔줌
		
		
		
		

	}

}

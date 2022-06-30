package Chapter_3;

public class String_equal {

	public static void main(String[] args) {

		
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		
		// 둘 모두 결과적으로는 String에 java를 저장하는것이지만
		// s1과 s2는 같은 주소에 같은 java를 저장하고
		// s3는 새로운(new) 주소에 java를 저장함
		
		System.out.println(s1 == s2);
		
		// True, s1과 s2의 주소값은 같다.
		// 즉, String에서 ==는 주소값이 같은지 비교함.
		
		System.out.println(s3.equals(s1));
		
		// True, s3.equals(s1)으로 주소값이 아닌 객체값을 비교하여 같은지 판별함
		
		
		
		System.out.println("s1과 s2는 같은가? " + s1 == s2);
		
		// false, +가 ==보다 먼저 실행이 되므로 "s1과 s2는 같은가" 와 s1 을 더한
		// String 을 s2랑 비교하였기에 false가 나옴
		
		System.out.println("s1과 s3는 같은가? " + s3.equals(s1));
		
		// s1과 s3는 같은가? True, 이 경우에는 s3.equals(s1)이 먼저 실행되므로 그대로임.
		

	}

}

package Chapter_4;

public class ProductDataMain {

	public static void main(String[] args) {
		
		productData p = new productData();
		System.out.println(p.getCode());
		// productData 클래스의 code의 값을 보여주는 메소드
		// 값은 따로 정하지 않았으므로 null, 즉 0으로 표시됨
		
		p.setCode(1234);
		System.out.println(p.getCode());
		// code 값을 설정하는 메소드를 호출하여 1234로 값을 변경 후 출력

	}

}

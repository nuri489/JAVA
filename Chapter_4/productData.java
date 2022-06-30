package Chapter_4;

public class productData {
	// 상품 코드 이름 가격 재고량 설명 이미지 등등
	
	private int code;
	private String name;
	private double price;
	private int amount;
	private String memo;
	
	public int getCode()
	{
		return code;
	}
	
	public void setCode(int c)
	{
		code = c;
	}

	// getCode는 code를 내보냄 = code 를 조회함
	// setCode는 code를 수정함
	// 즉, private 변수를 조회 및 수정을 하기 위한 메소드를 구축함
	
	
	
	
	
}

class MemberData {
	
	// 회원아이디 암호 이름 주소 폰번호
	
	String id;
	private int password =1234;
	String name;
	String address;
	String phone;
	
	void changepassword()
	{
		password = 4321;
	}
	
	// private 변수는 해당 클래스에서만 변경가능하므로 변경 기능을 하는 메소드를 클래스 내부에 구현해놓는다.
	// 다른 클래스에서 암호를 볼 순 없지만 변경을 위해서 해당 메소드를 불러오면 됨 (private 메소드가 아니므로)	
}


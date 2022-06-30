package Chapter_5;

public interface Student {
	
	void study();
	void lunch();
	// void 앞에 abstract public 생략됨
	// 따라서 메소드는 미구현 되야 함.
	
	String name = "학생";
	// 앞에 public final static 생략됨
	// 따라서 정의와 동시에 초기화가 필요함
	

}

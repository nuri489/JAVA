package Chapter_11;

public class SystemClass_Test {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		System.out.println("최초시각 : " + System.currentTimeMillis());
		System.out.println("자바 버전 : " + System.getProperty("java.version"));
		System.out.println("OS : " + System.getProperty("os.name"));
		System.out.println("자바저장디렉토리 : " + System.getProperty("user.dir"));
		System.out.println("파일분리자 : " + System.getProperty("file.separator"));
		
		if(true)
		{
			System.exit(0);
		}
		for(int i=1; i<= 1000; i++)
		{
			System.out.println(i);
		}
		
		System.out.println("종료시각 : " + (System.currentTimeMillis() - start));
		
		
	}

}

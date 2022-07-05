package Chapter_11;

import java.util.Calendar;
import java.util.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class Date_Test {

	public static void main(String[] args) {
		
		long mill = System.currentTimeMillis();
		Date now = new Date(mill);
		
		System.out.println((mill)+ "\n" + (now));
		
		now.getDate();
		// 자바가 업데이트 되면서 사용을 자제하라는 권고 표식
		// 예전에 해당 메소드를 사용한 프로젝트가 있을 수 있으므로 삭제는 안했지만
		// 새로 만드는 프로젝트에는 왠만하면 사용하지 말라!
		
//		Calendar c = new Calendar();
		// calendar는 객체를 만들 수 없다.

		
		Calendar.getInstance();
		// abstract 클래스인 calendar 클래스를 사용하기 위해
		// 무명 클래스를 통해서 객체를 생성함
		Calendar c = Calendar.getInstance();
		// 객체의 이름이 없다는것만 제외하면 위와 아래는 같다.
		
		System.out.println(c);
		int year = c.get(Calendar.YEAR);
		int month = c.get((Calendar.MONTH));
		int day = c.get(Calendar.DAY_OF_MONTH);
		// get 메소드의 각 변수를 불러옴
		
		System.out.println(year);
		System.out.println(month+1);
		System.out.println(day);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초 E요일");
		System.out.println(sdf.format(c.getTime()));
		// 패턴을 이용하여 현재 시간 출력

		
		
		
	}

}

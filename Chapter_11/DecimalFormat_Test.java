package Chapter_11;

import java.text.DecimalFormat;

public class DecimalFormat_Test {

	public static void main(String[] args) {
		
		double a = 12345.55;
		DecimalFormat dci = new DecimalFormat("#,###");
		System.out.println(dci.format(a));
		// #,### 은 단위 구분을 하는 패턴이다.
		// 123456 -> 123,457
		// 소수점을 생략하면 반올림 한다.
		
		dci = new DecimalFormat("000,000.##");
		System.out.println(dci.format(a));
		// 원래 12,346 이지만 맨 앞의 빈 자리를 0으로 채움
		// #은 표시 할 수 없으면 무시하라
		
		dci = new DecimalFormat("#.00");
		System.out.println(dci.format(10/(double)3));
		
	}

}

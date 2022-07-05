package Chapter_11;

import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

public class RegularExpression_Test {

	public static void main(String[] args) {
		
		
		String P[] = {"010-1234-5678" , "011-1234-5678" , "010-12345-6789"};
		for(int i =0; i<3; i++)
		{
			boolean result = P[i].matches("(010|011)-\\d{4,5}-\\d{4}");
			System.out.println(result);
		}
		

		String address = "충북/청주시.수곡동";
		String result[] = address.split("/|\\.");
		
		for(int i =0; i<result.length; i++)
		{
			System.out.println(result[i]);
		}



	}

}

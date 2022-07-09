package Chapter_18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SampleInput_Test {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Users\\nuri4\\eclipse-workspace\\AI_platform\\src\\Chapter_18\\sample.dat");
		Scanner s = new Scanner(fr);

		String name = s.next();
		int id = s.nextInt();
		double pay = s.nextDouble();
		String line = (name + id + pay*12);
		System.out.println(line);
		
		FileWriter fw = new FileWriter("C:\\\\Users\\\\nuri4\\\\eclipse-workspace\\\\AI_platform\\\\src\\\\Chapter_18\\\\sample.dat",true);
		fw.write(line);
		fw.close();
		fr.close();
		
		// Reader,Writer 그리고 Scanner 을 조합하여 값을 읽고 그 값을 복사하여 추가
	}

}

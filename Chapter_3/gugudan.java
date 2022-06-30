package Chapter_3;

import javax.swing.JOptionPane;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int z = Integer.parseInt(JOptionPane.showInputDialog("구구단 : "));
		
		for(int x=1; x<10; x++)
		{
			for(int y1=1;  y1<10; y1++)
			{
				if(y1 != z)
				{
					System.out.print(y1 + "*" + x + "=" + x*y1 + "	"); // 공백은 Tap으로
					break;
				}
			}
			System.out.println(); // 줄바꿈을 위한 sysout
		}

		

		
/*		int S = Integer.parseInt(JOptionPane.showInputDialog("STAR = "));
		
		for(int x=1; x<S+1; x++)
		{
			for(int y=S+1; y>x; y--)
			{
				System.out.print("*");
			}

			System.out.println("=" + (S-x+1));
		}
		
*/		
		
		
		
		
		
		
		
		
		
	}
}




package pka;

public class Patterb123 {
	public static void main(String[] args) {
		int input=10;
		int row=input/2;
		int k=1;
		for(int i=1;i<row;i++)
		{
			for(int j=1;j<row-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		
	}

}

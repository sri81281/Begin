package pka;

public class Pattern1 {
	public static void main(String[] args) {
		
		int row=9;
		int n=9;
		for(int i=0;i<=row-1;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=row-i-1;j++)
			{
				System.out.print(n+" ");
			}
			n--;
			System.out.println();
		}
	}

}

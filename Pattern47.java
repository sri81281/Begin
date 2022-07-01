package pka;

public class Pattern47 {
	public static void main(String[] args) {
		int row=9;
		int rcount=1;
		for(int i=row;i>0;i--)
		{
			for(int j=1;j<=i*2;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=rcount;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=rcount-1;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			rcount++;
		}
		
		
	}

}

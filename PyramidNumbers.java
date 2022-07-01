
package pka;

public class PyramidNumbers {
public static void main(String[] args) {
	int row=10;
	
	int k=1;
	
	for(int i=0;i<row;i++)
	{
		for(int j=row;j>=i;j--)
		{
		System.out.print(" ");
		}
		for(int j=0;j<=i;j++)
		{
			System.out.print(i);
			k++;
		}
		System.out.println();
	}
	
}
}

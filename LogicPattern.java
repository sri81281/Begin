package pka;

public class LogicPattern {
public static void main(String[] args) {
	int input=15;
	int row=input/3;
	int print =1;
	
	for(int i=0;i<=row;i++)
	{
		
		for(int j=1;j<row-i;j++)
		{
			System.out.print(" ");
		}
		
		for(int j=0;j<=i;j++)
		{
			
			
		   if (print<=input) {
			System.out.print(print+" ");
			print++;
			}
		}
		
		
		System.out.println();
	}
}
}

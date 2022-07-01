package pka;

import java.util.Scanner;

public class NewPattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row;
		row=sc.nextInt();
		int rcount=1;
		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<=i*2;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=row;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=row-1;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			rcount++;
			System.out.println();
		}
	}

}

package pka;

import java.util.Scanner;

public class task12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		int l=s.length();
		char mul[][]=new char[l][l];
		
		for(int i=0;i<l;i++)
		{
			mul[i][i]=s.charAt(i);
		}
		for(int i=(l-1),j=0;j<l;j++,i--)
		{
			mul[i][j]=s.charAt(i);
		}
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<l;j++)
			{
				System.out.print(mul[i][j]+" ");
			}
			System.out.println();
		}
				
		
		
	}

}

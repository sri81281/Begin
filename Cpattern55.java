package pka;

import java.util.Scanner;

public class Cpattern55{
	public static void patternC(int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print("*");
			for(int j=0;j<n-1;j++)
			{
				if(i==0||i==n-1)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	patternC(n);
	sc.close();
}
}

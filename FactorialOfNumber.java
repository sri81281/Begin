package pka;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {
		
		System.out.println("enter the input");
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int f=1;
		for(int i=1;i<=n;i++)
		{
         f=f*i;
		}
		System.out.println(f);
	int sum=0;
	while(n!=0)
	{
		int f1=1;
		for(int i=1;i<=n;i++)
		{
		f1=f1*i;	
		}
		sum=sum+f1;
		n--;
	}
	System.out.println(sum);

	}
}

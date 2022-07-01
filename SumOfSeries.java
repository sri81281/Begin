package pka;

import java.util.Scanner;

public class SumOfSeries {
	public static void main(String[] args) {
		int sum=0;
		int temp=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			sum=sum*10+1;
			temp=temp+sum;
			
			System.out.print(sum);
			if(i<n)
			{
				System.out.print("+");
			}
			
		}
		
		System.out.println();
		System.out.println(temp);
	}

}

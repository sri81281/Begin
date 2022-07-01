package pka;

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		int num,i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("sum Starts from");
		i=sc.nextInt();
		System.out.println("Sum up to");
		num=sc.nextInt();
		
		for(int j=0;j<=num;j++)
		{
			sum=sum+j;
		}
		System.out.println(sum);
		System.out.println("largest sum="+num);
	}

}

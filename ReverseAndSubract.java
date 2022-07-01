package pka;

import java.util.Scanner;

public class ReverseAndSubract {
	public static void main(String[] args) {
		
		int i,rem,sum=0;
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt();
		int temp=i;
		while(i!=0) {
		rem=i%10;
		sum=(sum*10)+rem;
		i=i/10;
		}
		System.out.println(sum);
		System.out.println(temp);
		int result=temp-sum;
		System.out.println(result);
	}

}

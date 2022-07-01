package pka;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  the input");
		int input = sc.nextInt();
		int i=1;
		
		while(true) {
			for (int j = 1; j <= i; j++) 
				System.out.print(i + " ");
				i++;
			
			System.out.println();
			
			if(i==input)
			{
				break;
			}
		}
	}
}

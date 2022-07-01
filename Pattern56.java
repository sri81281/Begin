
package pka;

import java.util.Scanner;

public class Pattern56 {
public static void main(String[] args) {
	
	  Scanner sc=new Scanner(System.in); System.out.println("enter  the input");
	 int input=sc.nextInt();
	 
	
	int x=1;
	System.out.println("---------your output is---------");
	for(int i=2;i<input;i=i+2)
	{
		for(int j=1;j<input-i;j++)
		{
			System.out.print(" ");
		}
		for(int j=2;j<=i;j=j+2)
		{
			System.out.print(x+" ");
			x++;
		}
		System.out.println();
	}
	System.out.println();
	System.out.println("-------end of the program--------");
	
}
}

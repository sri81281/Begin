package pka;

import java.util.Scanner;

public class Program58 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int input=sc.nextInt();
	int row=input*2;
	
	for(int i=0;i<row;i++)
	{
		if(i==0||i==7)
		{
			System.out.println("********");
		}
		else if(i==1||i==6)
		{
			System.out.println("***__***");
		}
		else if(i==2||i==5)
		{
			System.out.println("**____**");
		}
		else
		{
			System.out.println("*______*");
		}
		
	}
}
}

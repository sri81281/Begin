package pka;

import java.util.Scanner;

public class Program2 {
	public static void printAlphabet(char c)
	{
		if(c>='a' && c<='z' || c>='A' && c<='Z')
		{
		while(c!=123)
		{
			if((c>=97)&&(c<=122))
			{
				System.out.println(c);
				c++;
			}
			else if((c>=65)&&(c<=90))
			{
				System.out.println(c);
				c++;
			}
		}
		}
		else
			System.out.println("wrong Input");
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char input=sc.next().charAt(0);
	printAlphabet(input);
}
}

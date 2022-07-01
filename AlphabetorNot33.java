package pka;

import java.util.Scanner;

public class AlphabetorNot33 {
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		char input=sc.next().charAt(0);
		alphabetOrNot(input);
		sc.close();
	}
	public static void alphabetOrNot(char ch)
	{
		if((ch>=65) && (ch<=90))
		{
			System.out.println("captital alphabets");
		}
		else if((ch>=97)  &&(ch<=122))
		{
			System.out.println("small alphabets");
		}
		else
			System.out.println("not an alphabets");
	}
	public static  void main(String[] args) {
		AlphabetorNot33 obj=new AlphabetorNot33();
		obj.input();
	}
}

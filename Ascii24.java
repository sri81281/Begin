package pka;

import java.util.Scanner;

public class Ascii24 {
	public void input()
	{
		Scanner sc=new Scanner(System.in);
	    char c=sc.next().charAt(0);
	    int i=ascii(c);
	    System.out.println(i);
	    sc.close();
	}
	public static int  ascii(char ch)
	{
		int i=(int)ch;
		return i;	
	}
	public static void main(String[] mano) {
		Ascii24 obj=new Ascii24();
		obj.input();
	}

}

package pka;

import java.util.Scanner;

public class SubString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s1=sc.nextLine();
		
		String s2=sc.nextLine();
		
		int s=1;
		for(int i=0;i<s1.length()-s2.length();i++)
		{
			int f=1;
			for(int j=0;i<s1.length() && j<s2.length();j++,i++)
			{
				if(s2.charAt(j)!=s1.charAt(i))
				{
					f=0;
					break;
				}
				
			}
			if(f==1)
			{
				s=0;
				System.out.println(i-s2.length());
			}
		}
		if(s==1)
		{
			System.out.println("-1");
		}
	}

}

package pka;

import java.util.Scanner;

public class StringCheck {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		int signal=1;
		for(int i=0;i<str1.length()-str2.length();i++)
		{
			int flag=1;

			for(int j=0;i<str1.length()&&j<str2.length();j++,i++)
			{
				if(str2.charAt(j)!=str1.charAt(i))
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
			{
				signal=0;
				System.out.println(i-str2.length());
			}
		}
		if(signal==1)
		{
			System.out.println("-1");
		}
		
	}

}

package pka;

import java.util.Scanner;

public class SubString59 {
	public static int subString(String firstString,String secondString)
	{
		int fLength=firstString.length();
		int sLength=secondString.length();
		int notASubString=1;
		for(int i=0;i<fLength-sLength;i++)
		{
			int findSubString=1;
			for(int j=0;j<sLength && i<fLength;i++,j++)
			{
					
				if(secondString.charAt(j)!=firstString.charAt(i))
				{
					findSubString=0;
					break;
				}
			}
			if(findSubString==1)
			{
				notASubString=0;
				return i-sLength;
			}
		}
       return -1;
	
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string:");
		String s1=sc.nextLine();
		System.out.println("enter the second String");
		String s2=sc.nextLine();
		sc.close();
		int i=subString(s1,s2);
		System.out.println(i);
	}

}

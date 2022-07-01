package pka;

import java.util.Scanner;

public class StringAlphabetPrinting {
	public void ready()
	{
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		StringAlphabetPrinting starting=new StringAlphabetPrinting();
		String s=starting.AlphabetPrinting(input);
		System.out.println(s);
		
	}
	public  String AlphabetPrinting(String s)
	{
		String output="";
		int length=s.length();
		int result=0;
		int signal1=0;
		int signal2=0;
		char c='\0';
		for(int i=0;i<length;i++)	
		{
            if(((int)s.charAt(i)>=48)&&((int)s.charAt(i)<=57))
			{
               for(int k=i;k<length;k++)
				{
					signal1=1;
				if(((int)s.charAt(k)>=48)&&((int)s.charAt(k)<=57)) {
					
				int num=(int)s.charAt(k);
			    int temp=num-48;
			    result=(result*10)+temp;
			    System.out.println("number="+result);
				}
				else {
					break;
				}
				
				}
			}
			 if(((int)s.charAt(i)>=97)&&((int)s.charAt(i)<=122))
			{
				 signal2=1;
				 c=s.charAt(i);
				 System.out.println("charater="+c);
			}
			 if(signal1==1 && signal2==1) {
			 for(int j=1;j<=result;j++)
				{
					output+=c;
					signal1=0;
					signal2=0;
				}
			 result=0;
			 }
		}
		return output;
	}
	public static void main(String[] args) {
		StringAlphabetPrinting start=new StringAlphabetPrinting();
		start.ready();
	}

}

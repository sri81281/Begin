package pka;

import java.util.Scanner;

public class Problem53 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int length=s.length();
	
	int result=0;
	int temp=0;
	int signal1=0;
	int signal2=0;
	char c='\0';
	String print="";
	
	for(int i=0;i<length;)
	{
		if(((int)s.charAt(i)>=48)&&((int)s.charAt(i)<=57)) {
			
	
		
		while(i<length)
		{
			signal1=1;
			if(((int)s.charAt(i)>=48)&&((int)s.charAt(i)<=57)) {
				
				int num=(int)s.charAt(i);
			    temp=num-48;
			    result=(result*10)+temp;
			    System.out.println("number="+result);
			    i++;
		}
			else
			{
			break;	
			}
			
		}
	}
		else if(((int)s.charAt(i)>=97)&&((int)s.charAt(i)<=122))
		{
			 signal2=1;
			 c=s.charAt(i);
			System.out.println("character="+c);
			i++;
		}
		if(signal1==1 && signal2==1) {
			 for(int j=1;j<=result;j++)
				{
					print+=c;
					signal1=0;
					signal2=0;
					
				}
			 result=0;
			 }
      }
	System.out.println(print);
}
}

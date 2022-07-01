package pka;

import java.util.Scanner;

public class StringProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String print="";
		int length=s.length();
		int result=0;
		int signal1=0;
		int signal2=0;
		char c='\0';
		int temp=0;
		int k=0;
		int i=0;
       
		for( i=0;i<length;i++)	
		{
            if(((int)s.charAt(i)>=48)&&((int)s.charAt(i)<=57))
			{
               for( k=i;k<length;k++)
				{
					signal1=1;
					
				if(((int)s.charAt(k)>=48)&&((int)s.charAt(k)<=57)) {
					
				int num=(int)s.charAt(k);
			    temp=num-48;
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
				System.out.println("character="+c);
				
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
			
	



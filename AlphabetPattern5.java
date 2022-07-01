package pka;

import java.util.Scanner;

public class AlphabetPattern5 {
        public static void printPattern(char ch)
        {
        	int row=0;
        	if(ch>=65 && ch<=90) {
        	char c=ch;
        	while(c!=64)
        	{
        		row++;
        		c--;
        	}
        	while(ch!=64)
    		{
    			for(int i=row;i>0;i--)
    			{
    			for(int j=0;j<i;j++) {
    				System.out.print(ch);
    			}
    				System.out.println();
    				ch--;
    		}
    		}
        	}
        	else if(ch>=97 && ch<=122)
        	{
        		char c=ch;
            	while(c!=96)
            	{
            		row++;
            		c--;
            	}
            	while(ch!=96)
        		{
        			for(int i=row;i>0;i--)
        			{
        			for(int j=0;j<i;j++) {
        				System.out.print(ch);
        			}
        				System.out.println();
        				ch--;
        		}
        		}
        	}
        	else
        		System.out.println("check the input you entered");
        		
        }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char input=sc.next().charAt(0);
		printPattern(input);
	}
}

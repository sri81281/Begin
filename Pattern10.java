package pka;

import java.util.Scanner;

public class Pattern10 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int row=n/2;
    int k=1;
    
    for(int i=1;i<row;i++)
    {
    	for(int j=1;j<row-i;j++)
    	{
    		System.out.print(" ");
    	}
    	for(int j=1;j<=i;j++)
    	{
    		System.out.print(k+" ");
    		k++;
    	}
    	
    	System.out.println();
    }
}
}

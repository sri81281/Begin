package pka;

import java.util.Arrays;

public class StringTest {
public static void main(String[] args) {
	String s="sri karan";
	int len=s.length();
	char x[]=s.toCharArray();
	
	for(int i=0;i<len;i++)
	{
		for(int j=i+1;j<len;j++)
		{
			if(x[i]>x[j])
			{
				char temp=x[i];
				x[i]=x[j];
				x[j]=temp;
			}
		}
	}
	char result[]=new char[len];
	
	int a=0;
	for(int i=0;i<len-1;i++)
	{
		if(x[i]!=x[i+1])
		{
			result[a++]=x[i];
		}
	}
	result[a++]=x[len-1];
	for(int k=0;k<a;k++)
	{
		System.out.print(result[k]+" ");
	}
	
}
}

package pka;

import java.util.Arrays;
import java.util.Scanner;

public class removeDuplicates {
	public static void duplicates(int arr[])
	{
		int result[]=new int[arr.length];
		int size=0;
		Arrays.sort(arr);
	for(int i=0;i<arr.length-1;i++)
	{
		if(arr[i]!=arr[i+1])
		{
			result[size++]=arr[i];
		}
	}
	result[size++]=arr[arr.length-1];
	for(int i=0;i<size;i++)
	{
		System.out.println(result[i]);
	}
	}
public static void main(String[] args) {
	int n;
	 Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
       int arr[]=new int[n];
 		 for(int i=0;i<n;i++)
 		{
 			arr[i]=sc.nextInt();
 		}
 		 duplicates(arr);
}
}

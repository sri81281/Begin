package pka;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElementsInArray44 {
	public static void duplicateElements(int arr[])
	{
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the size of an array");
         int n=sc.nextInt();
        int arr[]=new int[n];
  		 for(int i=0;i<n;i++)
  		{
  			System.out.println("enter"+" "+i+" "+"Indexof element");
  			arr[i]=sc.nextInt();
  		}
  	    sc.close();

		duplicateElements(arr);
		
	}

}

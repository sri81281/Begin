package pka;

import java.util.Arrays;
import java.util.Scanner;



public class MaxMin {
	public static void solve(int arr[],int n) {
		
		
		int i=0,j=n-1;
		while(i<j)
		{
			System.out.println(arr[j--]+"");
			System.out.println(arr[i++]+"");
		}
		if(n%2!=0) {
			System.out.println(arr[i]);
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
		int n1=arr.length;
		
		 for(int i=0;i<n;i++) { for(int j=i+1;j<n;j++) { 
			 int temp=0; 
		 if(arr[i]>arr[j])
		 
		  { temp=arr[i]; 
		  arr[i]=arr[j]; 
		  arr[j]=temp;
		  
		  }
		  
		  
		  } }
		/*
		 * for(int c:arr) { System.out.println(c); }
		 */
		solve(arr,n1);
		
		}
		 
	}



package pka;

import java.util.Scanner;

public class ElementsPresentInTheArray {
	public int elementsCount()
	{
		int count=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the size of an array");
         int n=sc.nextInt();
        int arr[]=new int[n];
  		 for(int i=0;i<n;i++)
  		{
  			System.out.println("enter"+" "+i+" "+"Indexof element");
  			arr[i]=sc.nextInt();
  			count++;
  		}
  	   
		sc.close();
		return count;
	}
	public static void main(String[] args) {
		ElementsPresentInTheArray obj=new ElementsPresentInTheArray();
		int result=obj.elementsCount();
		System.out.println("total number of elements present in the array="+result);
	}

}

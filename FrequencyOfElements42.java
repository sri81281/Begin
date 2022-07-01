package pka;

import java.util.Scanner;

public class FrequencyOfElements42 {
	  public static void separateElementCount(int arr[])
	  {
		  int result[]=new int[arr.length];
		  int k=0;
		  int d=-1;
		  for(int i=0;i<arr.length;i++)
		  {
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]=d;
				}
			}
			result[i]=count;
		  }
		  for(int i=0;i<arr.length;i++)
		  {
			  if(arr[i]!=d)
			  {
				  System.out.println(arr[i] + " "+ result[i]);
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
		separateElementCount(arr);
}
}

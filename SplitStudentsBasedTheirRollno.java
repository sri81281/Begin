package pka;

import java.util.Scanner;

public class SplitStudentsBasedTheirRollno {
	   public void Startup()
	   {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("enter the size of an array");
	         int n=sc.nextInt();
	        int input[]=new int[n];
	  		 for(int i=0;i<n;i++)
	  		{
	  			System.out.println("enter"+" "+i+" "+"Indexof element");
	  			input[i]=sc.nextInt();
	  		}
	  	    sc.close();
	  	    splitRollNo(input);
	   }
	   public void splitRollNo(int[] roll_no)
	   {
		   System.out.println("group 1");
		   for(int i=0;i<roll_no.length;i=i+4)
			{
				System.out.println(roll_no[i]);
			}
			System.out.println("group 2");
			for(int i=1;i<roll_no.length;i=i+4)
			{
				System.out.println(roll_no[i]);
			}
			System.out.println("group 3");
			for(int i=2;i<roll_no.length;i=i+4)
			{
				System.out.println(roll_no[i]);
			}
			System.out.println("group 4");
			for(int i=3;i<roll_no.length;i=i+4)
			{
				System.out.println(roll_no[i]);
			}
	   }
	public static void main(String[] args) {
		SplitStudentsBasedTheirRollno obj=new SplitStudentsBasedTheirRollno();
		obj.Startup();
	
	}
}
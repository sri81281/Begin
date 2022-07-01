package pka;

import java.util.Scanner;

public class OddPosition54 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		int even[]=new int[100];
		int odd[]=new int[100];
		int o=0,e=0;
		for(int i=0;i<count;i++)
		{
			if(i%2!=0)
			{
				even[e]=sc.nextInt();
				e++;
			}
			else
			{
				odd[o]=sc.nextInt();
				o++;
			}
		}
		
		
		
		for(int i=0;i<o-1;i++)
		{
			for(int j=i+1;j<o;j++)
			{
				if(odd[i]<odd[j])
				{
					int temp=odd[i];
					odd[i]=odd[j];
					odd[j]=temp;
				}
			}
		}

		
		
		for(int i=0;i<e-1;i++)
		{
			for(int j=i+1;j<e;j++)
			{
				if(even[i]>even[j])
				{
					int temp1=even[i];
					even[i]=even[j];
					even[j]=temp1;
				}
			}
		}
		
		
		int limit=o>e?o:e;
		for(int i=0;i<limit;i++)
		{
			if(i<o)
			System.out.print(" "+odd[i]);
			if(i<e)
			System.out.print(" "+even[i]);
			
		}
		
	}

}

	



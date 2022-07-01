package pka;

public class Frequency {
	public static void main(String[] args) {
		int arr[]= {1,2,3,1,3,4,5,6,1,2};
		int temp[]=new int[arr.length];
		
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
			if(temp[i]!=d)
			{
				temp[i]=count;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=d)
			{
			System.out.println(arr[i]+" "+temp[i]);	
			}
		}
	}

}

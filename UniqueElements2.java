package pka;

public class UniqueElements2 {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,1,2,6,7,10,3,4,11,11,12};
	int size=arr.length;
	int result[]=new int[size];
	int res[]=new int[size];
	for(int i=0;i<size;i++)
	{
		for(int j=i+1;j<size;j++)
		{
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
	int a=0;
	
	for(int i=0;i<size-1;)
	{
		if(arr[i]==arr[i+1])
		{
			i=i+2;
		}
		else
		{
		res[a++]=arr[i];
		i++;
		}
		
		
	}
	
    if(size%2==0)
    {
    	res[a++]=arr[size-1];
    }
	for(int i=0;i<a;i++)
	{
		System.out.println(res[i]);
	}
	}
}

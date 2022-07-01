package pka;

public class LargestNumber {
public static void main(String[] args) {
	int arr[]= {12,10,67,89,765,4334};
	
	int count=0;
	int max=arr[count];
	for(int i=1;i<arr.length;i++)
	{
		
		if(arr[i]<max)
		{
			max=arr[i];
		}
	}
	System.out.println(max);
}
}

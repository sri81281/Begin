package pka;

public class LeftShift {
public static void main(String[] args) {
	
	int arr[]= {1,2,3,4,5};
	int len=arr.length;
	for(int i=0;i<len;i++)
	{
		System.out.print(arr[i]);
	}
	
	int temp=arr[0];
	for(int i=0;i<len-1;i++)
	{
		arr[i]=arr[i+1];
	}
     arr[len-1]=temp;
     System.out.println();
     for(int i=0;i<len;i++)
 	{
 		System.out.print(arr[i]);
 	}
     
	}
}

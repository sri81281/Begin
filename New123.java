package pka;

public class New123 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		int length=arr.length;
		int i=0,j=length-1;
		
	while(i<j)
	{
		System.out.print(arr[j--]+" ");
		System.out.print(arr[i++]+" ");
	}
	
	if(length%2!=0)
	{
		System.out.println(arr[i]);
	}
	
	
	
	
	
	}

}

package pka;

public class OneArrayToAnotherArray {
	public static void main(String[] args) {
		int arr[]= {1,5,87,9,6,5};
		int arr1[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			arr1[i]=arr[i];
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}

}

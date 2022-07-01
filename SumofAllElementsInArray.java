package pka;

public class SumofAllElementsInArray {
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,3,4,1};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}

package pka;

import java.util.Arrays;

public class last {
	
	public static void solve(int ar[],int n)
	{
		Arrays.sort(ar);
		int i=0,j=n-1;
		while(i<j)
		{
			System.out.println(ar[j--]+" ");
			System.out.println(ar[i++]+" ");
		}
		if(n%2!=0)
		{
			System.out.println(ar[i]);
		}
	}
	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 4, 5, 6, 7};
		int len=arr.length;
		
		solve(arr,len);
			}

}

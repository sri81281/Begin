package pka;

import java.util.Arrays;

public class Test1 {
public static void main(String[] args) {
	int arr[]= {1,2,3,1,2,4,5,6,4};
	Arrays.sort(arr);
	int temp[]=new int[arr.length];
	int a=0;
	for(int i=0;i<arr.length-1;i++)
	{
		if(arr[i]!=arr[i+1])
		{
			temp[a++]=arr[i];
		}
	}
	temp[a++]=arr[arr.length-1];
	for(int i=0;i<a;i++)
	{
		System.out.println(temp[i]);
	}
}
}

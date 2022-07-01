package pka;

public class Debug {
	private int x=2;
	int arr[]= {1,2,3,4,5,1,2,3,4};
	public void array()
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==4)
		 System.out.println(arr[i]);
		}
	}
public static void main(String[] args) {
	
	new Debug().array();
}
}
